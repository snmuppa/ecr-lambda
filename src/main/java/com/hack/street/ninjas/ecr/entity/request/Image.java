package com.hack.street.ninjas.ecr.entity.request;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("repositoryName")
    @Expose
    private String repositoryName;

    @SerializedName("imageManifest")
    @Expose
    private String imageManifest;

    @SerializedName("registryId")
    @Expose
    private String registryId;

    @SerializedName("imageId")
    @Expose
    private ImageId imageId;

    /**
    * No args constructor for use in serialization
    * 
    */
    public Image() {}

    /**
    * 
    * @param imageId
    * @param imageManifest
    * @param repositoryName
    * @param registryId
    */
    public Image(String repositoryName, String imageManifest, String registryId, ImageId imageId) {
        super();
        this.repositoryName = repositoryName;
        this.imageManifest = imageManifest;
        this.registryId = registryId;
        this.imageId = imageId;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public Image withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    public String getImageManifest() {
        return imageManifest;
    }

    public void setImageManifest(String imageManifest) {
        this.imageManifest = imageManifest;
    }

    public Image withImageManifest(String imageManifest) {
        this.imageManifest = imageManifest;
        return this;
    }

    public String getRegistryId() {
        return registryId;
    }

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    public Image withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    public ImageId getImageId() {
        return imageId;
    }

    public void setImageId(ImageId imageId) {
        this.imageId = imageId;
    }

    public Image withImageId(ImageId imageId) {
        this.imageId = imageId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("repositoryName", repositoryName).append("imageManifest", imageManifest)
                .append("registryId", registryId).append("imageId", imageId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(imageId).append(imageManifest).append(repositoryName).append(registryId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Image) == false) {
            return false;
        }
        Image rhs = ((Image) other);
        return new EqualsBuilder().append(imageId, rhs.imageId).append(imageManifest, rhs.imageManifest)
                .append(repositoryName, rhs.repositoryName).append(registryId, rhs.registryId).isEquals();
    }
}
