package com.example.retrofitintro.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class News_Response {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("states")
    @Expose
    private Integer states;
    @SerializedName("data")
    @Expose
    private List<Result> data = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }

    public List<Result> getData() {
        return data;
    }

    public void setData(List<Result> data) {
        this.data = data;
    }



    public static class Result {

        public Result() {
        }

        public Result(String titleAr, String titleEn, String image, String date) {
            this.titleAr = titleAr;
            this.titleEn = titleEn;
            this.image = image;
            this.date = date;
        }

        @SerializedName("ID")
        @Expose
        private Integer iD;
        @SerializedName("TitleAr")
        @Expose
        private String titleAr;
        @SerializedName("TitleEn")
        @Expose
        private String titleEn;
        @SerializedName("Title")
        @Expose
        private String title;
        @SerializedName("DescrptionAr")
        @Expose
        private String descrptionAr;
        @SerializedName("DescrptionEn")
        @Expose
        private String descrptionEn;
        @SerializedName("Dsecrption")
        @Expose
        private String dsecrption;
        @SerializedName("Image")
        @Expose
        private String image;
        @SerializedName("Date")
        @Expose
        private String date;
        @SerializedName("Url")
        @Expose
        private Object url;
        @SerializedName("PageTotal")
        @Expose
        private Integer pageTotal;
        @SerializedName("CreatedDate")
        @Expose
        private String createdDate;
        @SerializedName("IsActive")
        @Expose
        private Boolean isActive;
        @SerializedName("Language")
        @Expose
        private Integer language;

        public Integer getID() {
            return iD;
        }

        public void setID(Integer iD) {
            this.iD = iD;
        }

        public String getTitleAr() {
            return titleAr;
        }

        public void setTitleAr(String titleAr) {
            this.titleAr = titleAr;
        }

        public String getTitleEn() {
            return titleEn;
        }

        public void setTitleEn(String titleEn) {
            this.titleEn = titleEn;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescrptionAr() {
            return descrptionAr;
        }

        public void setDescrptionAr(String descrptionAr) {
            this.descrptionAr = descrptionAr;
        }

        public String getDescrptionEn() {
            return descrptionEn;
        }

        public void setDescrptionEn(String descrptionEn) {
            this.descrptionEn = descrptionEn;
        }

        public String getDsecrption() {
            return dsecrption;
        }

        public void setDsecrption(String dsecrption) {
            this.dsecrption = dsecrption;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public Object getUrl() {
            return url;
        }

        public void setUrl(Object url) {
            this.url = url;
        }

        public Integer getPageTotal() {
            return pageTotal;
        }

        public void setPageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
        }

        public String  getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
        }

        public Boolean getIsActive() {
            return isActive;
        }

        public void setIsActive(Boolean isActive) {
            this.isActive = isActive;
        }

        public Integer getLanguage() {
            return language;
        }

        public void setLanguage(Integer language) {
            this.language = language;
        }

        public static List<News_Response.Result> createMovies() {
            List<News_Response.Result> movies = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                News_Response.Result movie = new News_Response.Result();
                movies.add(movie);
            }
            return movies;
        }
    }
}
