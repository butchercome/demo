package com.cjw.demo.address.entity;

import java.io.Serializable;

/**
 * Created by Javen on 2017/5/3.
 */
public class Result<T> implements Serializable{
    private boolean success;
    private String status;
    private String errorMessage;
    private T obj;


    public Result(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
