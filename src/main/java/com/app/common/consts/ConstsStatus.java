package com.app.common.consts;

/**
 * Created by Administrator on 2016/12/13 0013.
 */
public final class ConstsStatus {

    // ---------------------*通用状态*------------------------
    /**
     * 状态-0：默认状态
     */
    public final static Integer COMMON_DEFAULT_STATUS = 0;
    /**
     * 状态-1:删除状态
     */
    public final static Integer COMMON_DELETE_STATUS = 1;


    // ---------------------*用户地址状态*------------------------

    /**
     * 用户地址-0：非默认地址状态
     */
    public final static Integer USER_ADDRESS_NO_DEFAULT_STATUS = 0;

    /**
     * 用户地址-1：默认地址状态
     */
    public final static Integer USER_ADDRESS_DEFAULT_STATUS = 1;

    // ---------------------*订单状态*------------------------

    /**
     * 订单全查询状态设置
     */
    public final static Integer ORDER_QUEYR_ALL_STATUS = 0;

    /**
     * 订单状态-1：未支付
     */
    public final static Integer ORDER_NO_PAY_STATUS = 1;

    /**
     * 订单状态-2：已支付，未发货
     */
    public final static Integer ORDER_NO_SEND_STATUS = 2;

    /**
     * 订单状态-3：已发货，未收货
     */
    public final static Integer ORDER_NO_TAKE_STATUS = 3;

    /**
     * 订单状态-4：订单已完成
     */
    public final static Integer ORDER_FINISH_STATUS = 4;

    /**
     * 订单状态-10：订单取消->客户取消
     */
    public final static Integer ORDER_CUST_CANCEL_STATUS = 10;

    /**
     * 订单状态-11：订单取消->客户取消
     */
    public final static Integer ORDER_SYS_CANCEL_STATUS = 11;

    // ---------------------*支付状态*------------------------

    /**
     * 支付状态-0：初始化状态
     */
    public final static Integer PAY_INIT_STATUS = 0;

    /**
     * 支付状态-1：完成状态
     */
    public final static Integer PAY_FINISH_STATUS = 1;

    // ---------------------*库存变更状态*------------------------

    /**
     * 库存变更状态-1：采购增加库存
     */
    public final static Integer STORE_ADD_PURCH_STATUS = 1;

    /**
     * 库存变更状态-2：销售减少库存
     */
    public final static Integer STORE_REDUCE_SALE_STATUS = 2;

    /**
     * 库存变更状态-3：订单取消增加库存
     */
    public final static Integer STORE_ADD_BACK_STATUS = 3;

    /**
     * 库存变更状态-4：其他状态
     */
    public final static Integer STORE_OTHER_STATUS = 4;


}
