package com.hack.street.ninjas.ecr.entity.request;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attributes {

    @SerializedName("mfaAuthenticated")
    @Expose
    private String mfaAuthenticated;

    @SerializedName("creationDate")
    @Expose
    private String creationDate;

    /**
    * No args constructor for use in serialization
    * 
    */
    public Attributes() {}

    /**
    * 
    * @param creationDate
    * @param mfaAuthenticated
    */
    public Attributes(String mfaAuthenticated, String creationDate) {
        super();
        this.mfaAuthenticated = mfaAuthenticated;
        this.creationDate = creationDate;
    }

    public String getMfaAuthenticated() {
        return mfaAuthenticated;
    }

    public void setMfaAuthenticated(String mfaAuthenticated) {
        this.mfaAuthenticated = mfaAuthenticated;
    }

    public Attributes withMfaAuthenticated(String mfaAuthenticated) {
        this.mfaAuthenticated = mfaAuthenticated;
        return this;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Attributes withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mfaAuthenticated", mfaAuthenticated).append("creationDate", creationDate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(creationDate).append(mfaAuthenticated).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attributes) == false) {
            return false;
        }
        Attributes rhs = ((Attributes) other);
        return new EqualsBuilder().append(creationDate, rhs.creationDate).append(mfaAuthenticated, rhs.mfaAuthenticated).isEquals();
    }
}
