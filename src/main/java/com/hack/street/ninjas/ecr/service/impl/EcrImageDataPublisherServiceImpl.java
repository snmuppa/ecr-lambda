package com.hack.street.ninjas.ecr.service.impl;

import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.hack.street.ninjas.ecr.entity.request.EcrImageMetaData;
import com.hack.street.ninjas.ecr.entity.response.EcrImageDataPublisherResponse;
import com.hack.street.ninjas.ecr.entity.response.Status;
import com.hack.street.ninjas.ecr.service.EcrImageDataPublisherService;

public class EcrImageDataPublisherServiceImpl implements EcrImageDataPublisherService {
    private static final String BASE_URL_ENV_VARIABLE = "base_url";

    private static final String FALLBACK_BASE_URL = "http://a2359e64.ngrok.io/service/v1/aws";

    private String NOTIFICATION_URL = "";

    private static final String PUSH_SUCCESS_MESSAGE = "Image Metadata has been successfully published to all clients.";

    private static final String PUSH_FAILURE_MESSAGE = "There was an error while pushing image metadata to the clients.";

    private static final String UTF8_ENCODING = "UTF-8";

    public EcrImageDataPublisherServiceImpl() {
        String baseUrl = System.getenv(BASE_URL_ENV_VARIABLE);

        if (StringUtils.isBlank(baseUrl)) {
            NOTIFICATION_URL = FALLBACK_BASE_URL + "/notifications";
        } else {
            NOTIFICATION_URL = baseUrl.trim() + "/notifications";
        }
    }

    public EcrImageDataPublisherResponse publishEcrImageData(EcrImageMetaData imageData, Context context) {
        LambdaLogger logger = context.getLogger();

        EcrImageDataPublisherResponse ecrImageDataPublisherResponse = null;

        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        CloseableHttpResponse closeableHttpResponse = null;
        HttpPost httpPost = new HttpPost(NOTIFICATION_URL);

        String json = new com.google.gson.GsonBuilder().serializeNulls().create().toJson(imageData);
        StringEntity entity = null;
        try {
            entity = new StringEntity(json);

            httpPost.setEntity(entity);
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");

            closeableHttpResponse = closeableHttpClient.execute(httpPost);

            if (closeableHttpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK
                    || closeableHttpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_ACCEPTED
                    || closeableHttpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_CREATED) {
                ecrImageDataPublisherResponse = new EcrImageDataPublisherResponse(Status.SUCCESS.name(), "NONE", PUSH_SUCCESS_MESSAGE,
                        true);
            } else {
                StringWriter writer = new StringWriter();
                IOUtils.copy(closeableHttpResponse.getEntity().getContent(), writer, UTF8_ENCODING);
                ecrImageDataPublisherResponse = new EcrImageDataPublisherResponse(Status.SERVER_ERROR.name(), "Internal server error",
                        PUSH_FAILURE_MESSAGE + " " + closeableHttpResponse.getStatusLine().getStatusCode() + " response: "
                                + writer.toString(),
                        false);
            }
        } catch (UnsupportedEncodingException e) {
            logger.log(e.getMessage());
            ecrImageDataPublisherResponse = new EcrImageDataPublisherResponse(Status.SERVER_ERROR.name(), e.getClass().getName(),
                    PUSH_FAILURE_MESSAGE, false);
        } catch (ClientProtocolException e) {
            logger.log(e.getMessage());
            ecrImageDataPublisherResponse = new EcrImageDataPublisherResponse(Status.SERVER_ERROR.name(), e.getClass().getName(),
                    PUSH_FAILURE_MESSAGE, false);
        } catch (IOException e) {
            logger.log(e.getMessage());
            ecrImageDataPublisherResponse = new EcrImageDataPublisherResponse(Status.SERVER_ERROR.name(), e.getClass().getName(),
                    PUSH_FAILURE_MESSAGE, false);
        } finally {
            if (closeableHttpResponse != null) {
                try {
                    closeableHttpResponse.close();
                } catch (IOException e) {
                    logger.log(e.getMessage());
                    ecrImageDataPublisherResponse = new EcrImageDataPublisherResponse(Status.SERVER_ERROR.name(), e.getClass().getName(),
                            PUSH_FAILURE_MESSAGE, false);
                }
            }
        }

        return ecrImageDataPublisherResponse;
    }
}
