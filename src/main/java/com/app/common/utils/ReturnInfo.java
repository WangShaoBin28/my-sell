package com.app.common.utils;

public class ReturnInfo<T> {

    private boolean status = true;

    private String error;

    private T content;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ReturnInfo{" +
                "status=" + status +
                ", error='" + error + '\'' +
                ", content=" + content +
                '}';
    }
}
