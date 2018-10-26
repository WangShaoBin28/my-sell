package com.app.common.utils;


import com.app.common.consts.ConstCode;

/**
 * JSONResult : Response JSONResult for RESTful,封装返回JSON格式的数据
 */
public class ReturnInfo<T> extends Result {

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

    public ReturnInfo() {
        super();
    }

    /**
     * 自定义返回结果
     * @param data 数据
     * @param statusCode
     * @param message
     * @param success
     */
    public ReturnInfo(T data, Integer statusCode, String message, boolean success){
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
    public ReturnInfo(T data, boolean succes){
        this.data = data;
        super.setSuccess(succes);
        super.setStatusCode(!succes ? ConstCode.EXCEPTION_CODE : ConstCode.SUCCESS_CODE);
        super.setMessage(!succes ? ConstCode.EXCEPTION_MSG : ConstCode.SUCCESS_MSG);
    }

    /**
     * 成功返回数据和消息
     *
     * @param data
     * @param message
     */
    public ReturnInfo(T data, String message) {
        this.data = data;
        super.setSuccess(true);
        super.setMessage(message);
        super.setStatusCode(ConstCode.SUCCESS_CODE);
    }

    /**
     * 成功返回数据
     *
     * @param data
     */
    public ReturnInfo(T data) {
        this.data = data;
        super.setSuccess(true);
        super.setMessage(ConstCode.SUCCESS_MSG);
        super.setStatusCode(ConstCode.SUCCESS_CODE);
    }
}