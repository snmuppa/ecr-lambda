package com.hack.street.ninjas.ecr.entity.request;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EcrImageMetaData {

    @SerializedName("version")
    @Expose
    private String version;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("detail-type")
    @Expose
    private String detailType;

    @SerializedName("source")
    @Expose
    private String source;

    @SerializedName("account")
    @Expose
    private String account;

    @SerializedName("time")
    @Expose
    private String time;

    @SerializedName("region")
    @Expose
    private String region;

    @SerializedName("resources")
    @Expose
    private List<Object> resources = null;

    @SerializedName("detail")
    @Expose
    private Detail detail;

    /**
    * No args constructor for use in serialization
    */
    public EcrImageMetaData() {}

    /**
    * 
    * @param region
    * @param id
    * @param resources
    * @param detail
    * @param time
    * @param detailType
    * @param source
    * @param account
    * @param version
    */
    public EcrImageMetaData(String version, String id, String detailType, String source, String account, String time, String region,
            List<Object> resources, Detail detail) {
        super();
        this.version = version;
        this.id = id;
        this.detailType = detailType;
        this.source = source;
        this.account = account;
        this.time = time;
        this.region = region;
        this.resources = resources;
        this.detail = detail;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public EcrImageMetaData withVersion(String version) {
        this.version = version;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EcrImageMetaData withId(String id) {
        this.id = id;
        return this;
    }

    public String getDetailType() {
        return detailType;
    }

    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    public EcrImageMetaData withDetailType(String detailType) {
        this.detailType = detailType;
        return this;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public EcrImageMetaData withSource(String source) {
        this.source = source;
        return this;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public EcrImageMetaData withAccount(String account) {
        this.account = account;
        return this;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public EcrImageMetaData withTime(String time) {
        this.time = time;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public EcrImageMetaData withRegion(String region) {
        this.region = region;
        return this;
    }

    public List<Object> getResources() {
        return resources;
    }

    public void setResources(List<Object> resources) {
        this.resources = resources;
    }

    public EcrImageMetaData withResources(List<Object> resources) {
        this.resources = resources;
        return this;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public EcrImageMetaData withDetail(Detail detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("version", version).append("id", id).append("detailType", detailType)
                .append("source", source).append("account", account).append("time", time).append("region", region)
                .append("resources", resources).append("detail", detail).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(region).append(id).append(resources).append(detail).append(time).append(detailType)
                .append(source).append(account).append(version).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EcrImageMetaData) == false) {
            return false;
        }
        EcrImageMetaData rhs = ((EcrImageMetaData) other);
        return new EqualsBuilder().append(region, rhs.region).append(id, rhs.id).append(resources, rhs.resources).append(detail, rhs.detail)
                .append(time, rhs.time).append(detailType, rhs.detailType).append(source, rhs.source).append(account, rhs.account)
                .append(version, rhs.version).isEquals();
    }
}
