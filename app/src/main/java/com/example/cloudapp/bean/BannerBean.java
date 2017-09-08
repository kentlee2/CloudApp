package com.example.cloudapp.bean;

/**
 * Created by Administrator on 2017/9/9.
 */

public class BannerBean {
    private String objectId;
    private String type;
    private String title;
    private String linkUrl;
    private String date;
    private String bannerId;
    private String bannerAddr;
    private String createdAt;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBannerId() {
        return bannerId;
    }

    public void setBannerId(String bannerId) {
        this.bannerId = bannerId;
    }

    public String getBannerAddr() {
        return bannerAddr;
    }

    public void setBannerAddr(String bannerAddr) {
        this.bannerAddr = bannerAddr;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
