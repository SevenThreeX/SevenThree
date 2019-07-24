package com.seventhree.st.utils;

import java.util.ResourceBundle;

public class ResultModel {

    /**
     * 返回码
     */
    private int code;
    /**
     * 返回结果描述
     */
    private String message;
    /**
     * 返回数据
     */
    private Object data;

    public ResultModel(int code, String message) {
        this.code = code;
        this.message = message;
        this.data = "";
    }

    public ResultModel(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultModel(ResultStatus status) {
        this.code = status.getCode();
        this.message = status.getMessage();
        this.data = "";
    }
    public ResultModel(ResourceBundle myResourcesBundle,String key) {
        String aString = myResourcesBundle.getString(key);
        String[]arr=aString.split(",");
        this.code =Integer.parseInt(arr[0]);
        this.message = arr[1];
        this.data = "";
    }

    public ResultModel(ResultStatus status, Object data) {
        this.code = status.getCode();
        this.message = status.getMessage();
        this.data = data;
    }

    public static ResultModel ok(Object data) {
        return new ResultModel(ResultStatus.SUCCESS, data);
    }

    public static ResultModel ok() {
        return new ResultModel(ResultStatus.SUCCESS);
    }

    public static ResultModel error(ResultStatus error) {
        return new ResultModel(error);
    }
    public static ResultModel error(Object error) {
        return new ResultModel(ResultStatus.ERROR, error);
    }

    public static ResultModel error(ResourceBundle myResourcesBundle, String key) {
        return new ResultModel(myResourcesBundle, key);
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
    public void setData(Object data){
        this.data = data;
    }
}
