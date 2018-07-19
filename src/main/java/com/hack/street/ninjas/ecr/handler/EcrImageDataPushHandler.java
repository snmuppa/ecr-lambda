package com.hack.street.ninjas.ecr.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.inject.Inject;
import com.hack.street.ninjas.ecr.dependency.management.ServiceInjector;
import com.hack.street.ninjas.ecr.entity.request.EcrImageMetaData;
import com.hack.street.ninjas.ecr.entity.response.EcrImageDataPublisherResponse;
import com.hack.street.ninjas.ecr.service.EcrImageDataPublisherService;

public class EcrImageDataPushHandler implements RequestHandler<EcrImageMetaData, EcrImageDataPublisherResponse> {
    @Inject
    private EcrImageDataPublisherService ecrImageDataPublisherService;

    public EcrImageDataPushHandler() {
        ServiceInjector.getInjector().injectMembers(this);
    }

    public EcrImageDataPublisherResponse handleRequest(EcrImageMetaData ecrImageMetaData, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log(ecrImageMetaData.toString());

        EcrImageDataPublisherResponse reponse = null;
        reponse = ecrImageDataPublisherService.publishEcrImageData(ecrImageMetaData, context);
        logger.log(reponse.toString());

        return reponse;
    }
}
