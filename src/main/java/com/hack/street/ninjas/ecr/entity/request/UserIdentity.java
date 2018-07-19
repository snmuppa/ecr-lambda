package com.hack.street.ninjas.ecr.entity.request;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserIdentity {

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("principalId")
    @Expose
    private String principalId;

    @SerializedName("arn")
    @Expose
    private String arn;

    @SerializedName("accountId")
    @Expose
    private String accountId;

    @SerializedName("accessKeyId")
    @Expose
    private String accessKeyId;

    @SerializedName("sessionContext")
    @Expose
    private SessionContext sessionContext;

    @SerializedName("invokedBy")
    @Expose
    private String invokedBy;

    /**
    * No args constructor for use in serialization
    * 
    */
    public UserIdentity() {}

    /**
    * 
    * @param sessionContext
    * @param accountId
    * @param principalId
    * @param accessKeyId
    * @param arn
    * @param type
    * @param invokedBy
    */
    public UserIdentity(String type, String principalId, String arn, String accountId, String accessKeyId, SessionContext sessionContext,
            String invokedBy) {
        super();
        this.type = type;
        this.principalId = principalId;
        this.arn = arn;
        this.accountId = accountId;
        this.accessKeyId = accessKeyId;
        this.sessionContext = sessionContext;
        this.invokedBy = invokedBy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserIdentity withType(String type) {
        this.type = type;
        return this;
    }

    public String getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    public UserIdentity withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    public String getArn() {
        return arn;
    }

    public void setArn(String arn) {
        this.arn = arn;
    }

    public UserIdentity withArn(String arn) {
        this.arn = arn;
        return this;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public UserIdentity withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public UserIdentity withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    public SessionContext getSessionContext() {
        return sessionContext;
    }

    public void setSessionContext(SessionContext sessionContext) {
        this.sessionContext = sessionContext;
    }

    public UserIdentity withSessionContext(SessionContext sessionContext) {
        this.sessionContext = sessionContext;
        return this;
    }

    public String getInvokedBy() {
        return invokedBy;
    }

    public void setInvokedBy(String invokedBy) {
        this.invokedBy = invokedBy;
    }

    public UserIdentity withInvokedBy(String invokedBy) {
        this.invokedBy = invokedBy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("principalId", principalId).append("arn", arn)
                .append("accountId", accountId).append("accessKeyId", accessKeyId).append("sessionContext", sessionContext)
                .append("invokedBy", invokedBy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sessionContext).append(accountId).append(principalId).append(accessKeyId).append(arn)
                .append(type).append(invokedBy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserIdentity) == false) {
            return false;
        }
        UserIdentity rhs = ((UserIdentity) other);
        return new EqualsBuilder().append(sessionContext, rhs.sessionContext).append(accountId, rhs.accountId)
                .append(principalId, rhs.principalId).append(accessKeyId, rhs.accessKeyId).append(arn, rhs.arn).append(type, rhs.type)
                .append(invokedBy, rhs.invokedBy).isEquals();
    }
}
