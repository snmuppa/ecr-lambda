package com.hack.street.ninjas.ecr.entity.response;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EcrImageDataPublisherResponse {
    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("errorType")
    @Expose
    private String errorType;

    @SerializedName("statusMessage")
    @Expose
    private String statusMessage;

    @SerializedName("statusSuccess")
    @Expose
    private boolean statusSuccess;

    /**
    * No args constructor for use in serialization
    */
    public EcrImageDataPublisherResponse() {}

    /**
    * Constructor to instantiate the response object
    * @param status
    * @param errorType
    * @param statusMessage
    * @param statusSuccess
    */
    public EcrImageDataPublisherResponse(String status, String errorType, String statusMessage, boolean statusSuccess) {
        super();
        this.status = status;
        this.errorType = errorType;
        this.statusMessage = statusMessage;
        this.statusSuccess = statusSuccess;
    }

    public String getStatus() {
        return status;
    }

    public String getErrorType() {
        return errorType;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public boolean isStatusSuccess() {
        return statusSuccess;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("status", status).append("errorType", errorType).append("statusMessage", statusMessage)
                .append("statusSuccess", statusSuccess).toString();
    }
}
