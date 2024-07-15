package com.learningspring.app.dto;

import java.util.LinkedHashMap;

public class ResponseDto {
    private Boolean success = true;
    private String message;
    private Object data;
    private LinkedHashMap<String, String> errors;
    private String debugHint;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public LinkedHashMap<String, String> getErrors() {
        return errors;
    }

    public void setErrors(LinkedHashMap<String, String> errors) {
        this.errors = errors;
    }

    public String getDebugHint() {
        return debugHint;
    }

    public void setDebugHint(String debugHint) {
        this.debugHint = debugHint;
    }

    public ResponseDto(Boolean success, String message, Object data, LinkedHashMap<String, String> errors, String debugHint) {
        this.success = success;
        this.message = message;
        this.data = data;
        this.errors = errors;
        this.debugHint = debugHint;


    }

    public ResponseDto() {
    }

    public ResponseDto(Object data) {
        this.data = data;
    }
}
