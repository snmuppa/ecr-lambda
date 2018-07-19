package com.hack.street.ninjas.ecr.entity.request;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestParameters {
    @SerializedName("repositoryName")
    @Expose
    private String repositoryName;

    @SerializedName("imageTag")
    @Expose
    private String imageTag;

    @SerializedName("registryId")
    @Expose
    private String registryId;

    @SerializedName("imageManifest")
    @Expose
    private String imageManifest;

    /**
    * No args constructor for use in serialization
    * 
    */
    public RequestParameters() {}

    /**
    * 
    * @param imageTag
    * @param imageManifest
    * @param repositoryName
    * @param registryId
    */
    public RequestParameters(String repositoryName, String imageTag, String registryId, String imageManifest) {
        super();
        this.repositoryName = repositoryName;
        this.imageTag = imageTag;
        this.registryId = registryId;
        this.imageManifest = imageManifest;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public RequestParameters withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    public String getImageTag() {
        return imageTag;
    }

    public void setImageTag(String imageTag) {
        this.imageTag = imageTag;
    }

    public RequestParameters withImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }

    public String getRegistryId() {
        return registryId;
    }

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    public RequestParameters withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    public String getImageManifest() {
        return imageManifest;
    }

    public void setImageManifest(String imageManifest) {
        this.imageManifest = imageManifest;
    }

    public RequestParameters withImageManifest(String imageManifest) {
        this.imageManifest = imageManifest;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("repositoryName", repositoryName).append("imageTag", imageTag)
                .append("registryId", registryId).append("imageManifest", imageManifest).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(imageTag).append(imageManifest).append(repositoryName).append(registryId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequestParameters) == false) {
            return false;
        }
        RequestParameters rhs = ((RequestParameters) other);
        return new EqualsBuilder().append(imageTag, rhs.imageTag).append(imageManifest, rhs.imageManifest)
                .append(repositoryName, rhs.repositoryName).append(registryId, rhs.registryId).isEquals();
    }
}
