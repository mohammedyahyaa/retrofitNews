package com.example.retrofitintro.pojo;


public class NewDetailsResponse {


    /**
     * message : success
     * states : 1
     * data : {"ID":7,"TitleAr":"لاب","TitleEn":"قفق","Title":"لاب","DescrptionAr":"فق","DescrptionEn":"قفاف","Dsecrption":"فق","Image":"http://23.236.154.106:5077/UploadedImages/","Date":"0001-01-01T00:00:00","Url":null,"PageTotal":0,"CreatedDate":"2019-03-04T11:40:49.547","IsActive":true,"Language":0}
     */

    private String message;
    private int states;
    private DataEntity data;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStates(int states) {
        this.states = states;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public int getStates() {
        return states;
    }

    public DataEntity getData() {
        return data;
    }

    public static class DataEntity {
        /**
         * ID : 7
         * TitleAr : لاب
         * TitleEn : قفق
         * Title : لاب
         * DescrptionAr : فق
         * DescrptionEn : قفاف
         * Dsecrption : فق
         * Image : http://23.236.154.106:5077/UploadedImages/
         * Date : 0001-01-01T00:00:00
         * Url : null
         * PageTotal : 0
         * CreatedDate : 2019-03-04T11:40:49.547
         * IsActive : true
         * Language : 0
         */

        private int ID;
        private String TitleAr;
        private String TitleEn;
        private String Title;
        private String DescrptionAr;
        private String DescrptionEn;
        private String Dsecrption;
        private String Image;
        private String Date;
        private String Url;
        private int PageTotal;
        private String CreatedDate;
        private boolean IsActive;
        private int Language;

        public void setID(int ID) {
            this.ID = ID;
        }

        public void setTitleAr(String TitleAr) {
            this.TitleAr = TitleAr;
        }

        public void setTitleEn(String TitleEn) {
            this.TitleEn = TitleEn;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public void setDescrptionAr(String DescrptionAr) {
            this.DescrptionAr = DescrptionAr;
        }

        public void setDescrptionEn(String DescrptionEn) {
            this.DescrptionEn = DescrptionEn;
        }

        public void setDsecrption(String Dsecrption) {
            this.Dsecrption = Dsecrption;
        }

        public void setImage(String Image) {
            this.Image = Image;
        }

        public void setDate(String Date) {
            this.Date = Date;
        }

        public void setUrl(String Url) {
            this.Url = Url;
        }

        public void setPageTotal(int PageTotal) {
            this.PageTotal = PageTotal;
        }

        public void setCreatedDate(String CreatedDate) {
            this.CreatedDate = CreatedDate;
        }

        public void setIsActive(boolean IsActive) {
            this.IsActive = IsActive;
        }

        public void setLanguage(int Language) {
            this.Language = Language;
        }

        public int getID() {
            return ID;
        }

        public String getTitleAr() {
            return TitleAr;
        }

        public String getTitleEn() {
            return TitleEn;
        }

        public String getTitle() {
            return Title;
        }

        public String getDescrptionAr() {
            return DescrptionAr;
        }

        public String getDescrptionEn() {
            return DescrptionEn;
        }

        public String getDsecrption() {
            return Dsecrption;
        }

        public String getImage() {
            return Image;
        }

        public String getDate() {
            return Date;
        }

        public String getUrl() {
            return Url;
        }

        public int getPageTotal() {
            return PageTotal;
        }

        public String getCreatedDate() {
            return CreatedDate;
        }

        public boolean getIsActive() {
            return IsActive;
        }

        public int getLanguage() {
            return Language;
        }
    }
}
