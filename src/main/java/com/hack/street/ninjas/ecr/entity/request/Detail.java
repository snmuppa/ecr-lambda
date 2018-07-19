package com.hack.street.ninjas.ecr.entity.request;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Detail {

    @SerializedName("eventVersion")
    @Expose
    private String eventVersion;

    @SerializedName("userIdentity")
    @Expose
    private UserIdentity userIdentity;

    @SerializedName("eventTime")
    @Expose
    private String eventTime;

    @SerializedName("eventSource")
    @Expose
    private String eventSource;

    @SerializedName("eventName")
    @Expose
    private String eventName;

    @SerializedName("awsRegion")
    @Expose
    private String awsRegion;

    @SerializedName("sourceIPAddress")
    @Expose
    private String sourceIPAddress;

    @SerializedName("userAgent")
    @Expose
    private String userAgent;

    @SerializedName("requestParameters")
    @Expose
    private RequestParameters requestParameters;

    @SerializedName("responseElements")
    @Expose
    private ResponseElements responseElements;

    @SerializedName("requestID")
    @Expose
    private String requestID;

    @SerializedName("eventID")
    @Expose
    private String eventID;

    @SerializedName("resources")
    @Expose
    private List<Resource> resources = null;

    @SerializedName("eventType")
    @Expose
    private String eventType;

    /**
    * No args constructor for use in serialization
    * 
    */
    public Detail() {}

    /**
    * 
    * @param resources
    * @param userIdentity
    * @param userAgent
    * @param eventType
    * @param awsRegion
    * @param requestParameters
    * @param eventSource
    * @param eventID
    * @param requestID
    * @param sourceIPAddress
    * @param responseElements
    * @param eventVersion
    * @param eventName
    * @param eventTime
    */
    public Detail(String eventVersion, UserIdentity userIdentity, String eventTime, String eventSource, String eventName, String awsRegion,
            String sourceIPAddress, String userAgent, RequestParameters requestParameters, ResponseElements responseElements,
            String requestID, String eventID, List<Resource> resources, String eventType) {
        super();
        this.eventVersion = eventVersion;
        this.userIdentity = userIdentity;
        this.eventTime = eventTime;
        this.eventSource = eventSource;
        this.eventName = eventName;
        this.awsRegion = awsRegion;
        this.sourceIPAddress = sourceIPAddress;
        this.userAgent = userAgent;
        this.requestParameters = requestParameters;
        this.responseElements = responseElements;
        this.requestID = requestID;
        this.eventID = eventID;
        this.resources = resources;
        this.eventType = eventType;
    }

    public String getEventVersion() {
        return eventVersion;
    }

    public void setEventVersion(String eventVersion) {
        this.eventVersion = eventVersion;
    }

    public Detail withEventVersion(String eventVersion) {
        this.eventVersion = eventVersion;
        return this;
    }

    public UserIdentity getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
    }

    public Detail withUserIdentity(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
        return this;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public Detail withEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    public String getEventSource() {
        return eventSource;
    }

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    public Detail withEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Detail withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public String getAwsRegion() {
        return awsRegion;
    }

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    public Detail withAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
        return this;
    }

    public String getSourceIPAddress() {
        return sourceIPAddress;
    }

    public void setSourceIPAddress(String sourceIPAddress) {
        this.sourceIPAddress = sourceIPAddress;
    }

    public Detail withSourceIPAddress(String sourceIPAddress) {
        this.sourceIPAddress = sourceIPAddress;
        return this;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Detail withUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    public RequestParameters getRequestParameters() {
        return requestParameters;
    }

    public void setRequestParameters(RequestParameters requestParameters) {
        this.requestParameters = requestParameters;
    }

    public Detail withRequestParameters(RequestParameters requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }

    public ResponseElements getResponseElements() {
        return responseElements;
    }

    public void setResponseElements(ResponseElements responseElements) {
        this.responseElements = responseElements;
    }

    public Detail withResponseElements(ResponseElements responseElements) {
        this.responseElements = responseElements;
        return this;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public Detail withRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public Detail withEventID(String eventID) {
        this.eventID = eventID;
        return this;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public Detail withResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Detail withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("eventVersion", eventVersion).append("userIdentity", userIdentity)
                .append("eventTime", eventTime).append("eventSource", eventSource).append("eventName", eventName)
                .append("awsRegion", awsRegion).append("sourceIPAddress", sourceIPAddress).append("userAgent", userAgent)
                .append("requestParameters", requestParameters).append("responseElements", responseElements).append("requestID", requestID)
                .append("eventID", eventID).append("resources", resources).append("eventType", eventType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resources).append(userIdentity).append(userAgent).append(eventType).append(awsRegion)
                .append(requestParameters).append(eventSource).append(eventID).append(requestID).append(sourceIPAddress)
                .append(responseElements).append(eventName).append(eventVersion).append(eventTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Detail) == false) {
            return false;
        }
        Detail rhs = ((Detail) other);
        return new EqualsBuilder().append(resources, rhs.resources).append(userIdentity, rhs.userIdentity).append(userAgent, rhs.userAgent)
                .append(eventType, rhs.eventType).append(awsRegion, rhs.awsRegion).append(requestParameters, rhs.requestParameters)
                .append(eventSource, rhs.eventSource).append(eventID, rhs.eventID).append(requestID, rhs.requestID)
                .append(sourceIPAddress, rhs.sourceIPAddress).append(responseElements, rhs.responseElements)
                .append(eventName, rhs.eventName).append(eventVersion, rhs.eventVersion).append(eventTime, rhs.eventTime).isEquals();
    }
}
