package com.app.common.utils;


import com.app.common.consts.ConstsCode;

/**
 * JSONResult : Response JSONResult for RESTful,封装返回JSON格式的数据
 */
public class JSONResult<T> extends Result {

    private static final long serialVersionUID = 7880907731807860636L;

    /**
     * 数据
     */
    private T data;


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public JSONResult() {
        super();
    }

    /**
     * 自定义返回结果
     * @param data 数据
     * @param statusCode
     * @param message
     * @param success
     */
    public JSONResult(T data, Integer statusCode, String message, boolean success){
        this.data = data;
        super.setStatusCode(statusCode);
        super.setMessage(message);
        super.setSuccess(success);
    }

    /**
     * 自定义返回结果
     * @pata 数据
     * @param data
     * @param succes
     */
    public JSONResult(T data, boolean succes){
        this.data = data;
        super.setSuccess(succes);
        super.setStatusCode(!succes ? ConstsCode.EXCEPTION_CODE : ConstsCode.SUCCESS_CODE);
        super.setMessage(!succes ? ConstsCode.EXCEPTION_MSG : ConstsCode.SUCCESS_MSG);
    }

    /**
     * 成功返回数据和消息
     *
     * @param data
     * @param message
     */
    public JSONResult(T data, String message) {
        this.data = data;
        super.setSuccess(true);
        super.setMessage(message);
        super.setStatusCode(ConstsCode.SUCCESS_CODE);
    }

    /**
     * 成功返回数据
     *
     * @param data
     */
    public JSONResult(T data) {
        this.data = data;
        super.setSuccess(true);
        super.setMessage(ConstsCode.SUCCESS_MSG);
        super.setStatusCode(ConstsCode.SUCCESS_CODE);
    }
}