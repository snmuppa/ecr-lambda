package com.hack.street.ninjas.ecr.entity.request;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Resource {
    @SerializedName("ARN")
    @Expose
    private String aRN;

    @SerializedName("accountId")
    @Expose
    private String accountId;

    /**
    * No args constructor for use in serialization
    * 
    */
    public Resource() {}

    /**
    * 
    * @param aRN
    * @param accountId
    */
    public Resource(String aRN, String accountId) {
        super();
        this.aRN = aRN;
        this.accountId = accountId;
    }

    public String getARN() {
        return aRN;
    }

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    public Resource withARN(String aRN) {
        this.aRN = aRN;
        return this;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Resource withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("aRN", aRN).append("accountId", accountId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(aRN).append(accountId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resource) == false) {
            return false;
        }
        Resource rhs = ((Resource) other);
        return new EqualsBuilder().append(aRN, rhs.aRN).append(accountId, rhs.accountId).isEquals();
    }
}
