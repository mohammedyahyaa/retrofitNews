package com.example.retrofitintro.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewsRequest {

    @SerializedName("pagenumber")
    @Expose
    private Integer pagenumber;
    @SerializedName("pagesize")
    @Expose
    private Integer pagesize;
    @SerializedName("lang")
    @Expose
    private Integer lang;

    public NewsRequest(Integer pagenumber, Integer pagesize, Integer lang) {
        this.pagenumber = pagenumber;
        this.pagesize = pagesize;
        this.lang = lang;
    }

    public Integer getPagenumber() {
        return pagenumber;
    }

    public void setPagenumber(Integer pagenumber) {
        this.pagenumber = pagenumber;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public Integer getLang() {
        return lang;
    }

    public void setLang(Integer lang) {
        this.lang = lang;
    }

}
