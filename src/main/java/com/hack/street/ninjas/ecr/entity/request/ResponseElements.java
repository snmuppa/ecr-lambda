package com.hack.street.ninjas.ecr.entity.request;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseElements {

    @SerializedName("image")
    @Expose
    private Image image;

    /**
    * No args constructor for use in serialization
    * 
    */
    public ResponseElements() {}

    /**
    * 
    * @param image
    */
    public ResponseElements(Image image) {
        super();
        this.image = image;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public ResponseElements withImage(Image image) {
        this.image = image;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("image", image).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(image).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResponseElements) == false) {
            return false;
        }
        ResponseElements rhs = ((ResponseElements) other);
        return new EqualsBuilder().append(image, rhs.image).isEquals();
    }
}
