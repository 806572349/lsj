package com.laosiji.movie.model;

import org.springframework.data.annotation.Id;

public class HeadInfo {
    @Id
    private String id;
    private String infoName;
    private String infoImgUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName;
    }

    public String getInfoImgUrl() {
        return infoImgUrl;
    }

    public void setInfoImgUrl(String infoImgUrl) {
        this.infoImgUrl = infoImgUrl;
    }
}
