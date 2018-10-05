package com.marketplace.kelompok2.kue.model.response;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DataResponse<MODEL> {

    @SerializedName("message")
    private String message = null;

    @SerializedName("data")
    private ArrayList<MODEL> listData = null;

    @SerializedName("error_message")
    private String errorMessage = null;

    public DataResponse(){

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<MODEL> getListData() {
        return listData;
    }

    public void setListData(ArrayList<MODEL> listData) {
        this.listData = listData;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
