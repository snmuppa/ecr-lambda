package com.hack.street.ninjas.ecr.entity.request;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SessionContext {

    @SerializedName("attributes")
    @Expose
    private Attributes attributes;

    /**
    * No args constructor for use in serialization
    * 
    */
    public SessionContext() {}

    /**
    * 
    * @param attributes
    */
    public SessionContext(Attributes attributes) {
        super();
        this.attributes = attributes;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public SessionContext withAttributes(Attributes attributes) {
        this.attributes = attributes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("attributes", attributes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(attributes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SessionContext) == false) {
            return false;
        }
        SessionContext rhs = ((SessionContext) other);
        return new EqualsBuilder().append(attributes, rhs.attributes).isEquals();
    }
}
