package com.hack.street.ninjas.ecr.entity.request;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageId {

    @SerializedName("imageDigest")
    @Expose
    private String imageDigest;

    @SerializedName("imageTag")
    @Expose
    private String imageTag;

    /**
    * No args constructor for use in serialization
    * 
    */
    public ImageId() {}

    /**
    * 
    * @param imageTag
    * @param imageDigest
    */
    public ImageId(String imageDigest, String imageTag) {
        super();
        this.imageDigest = imageDigest;
        this.imageTag = imageTag;
    }

    public String getImageDigest() {
        return imageDigest;
    }

    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    public ImageId withImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }

    public String getImageTag() {
        return imageTag;
    }

    public void setImageTag(String imageTag) {
        this.imageTag = imageTag;
    }

    public ImageId withImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("imageDigest", imageDigest).append("imageTag", imageTag).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(imageTag).append(imageDigest).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImageId) == false) {
            return false;
        }
        ImageId rhs = ((ImageId) other);
        return new EqualsBuilder().append(imageTag, rhs.imageTag).append(imageDigest, rhs.imageDigest).isEquals();
    }
}
