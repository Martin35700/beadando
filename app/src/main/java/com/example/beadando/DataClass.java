package com.example.beadando;

public class DataClass {

    public String getDataTitle() {
        return dataTitle;
    }

    public String getDataDesc() {
        return dataDesc;
    }

    public String getDataDate() {
        return dataDate;
    }

    public String getDataUser() {return dataUser; }

    public String getDataImage() {
        return dataImage;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    private String dataTitle;
    private String dataDesc;
    private String dataDate;

    private String dataUser;

    private String dataImage;



    private String key;


    public DataClass(String dataTitle, String dataDesc, String dataDate, String dataUser, String dataImage) {
        this.dataTitle = dataTitle;
        this.dataDesc = dataDesc;
        this.dataDate = dataDate;
        this.dataUser=dataUser;
        this.dataImage = dataImage;
    }

    public DataClass(){

    }
}
