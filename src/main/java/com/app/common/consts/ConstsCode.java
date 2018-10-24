package com.app.common.consts;

/**
 * Created by Administrator on 2016/11/16 0016.
 */
public final class ConstsCode {

    /** -----------------------------通用部分---------------------------- */

    /**
     * 操作成功
     */
    public static final Integer SUCCESS_CODE = 200;
    public static final String SUCCESS_MSG = "操作成功";

    /**
     * 网络超时
     */
    public static final Integer TIMEOUT_CODE = 203;
    public static final String TIMEOUT_MSG = "网络超时";

    /**
     * 参数错误
     */
    public static final Integer PARAMS_ERR_CODE = 205;
    public static final String PARAMS_ERR_MSG = "参数错误";

    /**
     * 操作异常
     */
    public static final Integer EXCEPTION_CODE = 207;
    public static final String EXCEPTION_MSG = "操作异常";

    /** -----------------------------商户部分---------------------------- */

    /**
     * 商户不存在
     */
    public static final Integer USER_ACCOUNT_CODE = 301;
    public static final String USER_ACCOUNT_MSG = "商户不存在";

    /**
     * 商户已注册
     */
    public static final Integer USER_REGISTER_CODE = 303;
    public static final String USER_REGISTER_MSG = "已注册";

    /**
     * 商户被禁用
     */
    public static final Integer USER_FORBIN_CODE = 305;
    public static final String USER_FORBIN_MSG ="已禁用";

    /**
     * 密码错误
     */
    public static final Integer USER_PASSWORD_CODE = 307;
    public static final String USER_PASSWORD_MSG = "密码错误";

/** -----------------------------商品部分---------------------------- */
/** -----------------------------订单部分---------------------------- */
    /**
     * 订单未找到
     */
    public static final Integer ORDER_NOFOUNT_CODE = 501;
    public static final String ORDER_NOFOUNT_MSG = "订单未找到";
    /**
     * 取消失败
     */
    public static final Integer ORDER_NOCANCEL_CODE = 702;
    public static final String ORDER_NOCANCEL_MSG = "订单取消失败";

/** -----------------------------购物车部分---------------------------- */

/** -----------------------------库存部分---------------------------- */

    /**
     * 库存不足
     */
    public static final Integer STOCK_SHORT_CODE = 701;
    public static final String STOCK_SHORT_MSG = "库存不足";

    /**
     * 没有库存，数据不存在
     */
    public static final Integer STOCK_NOFOUNT_CODE = 702;
    public static final String STOCK_NOFOUNT_MSG = "没有库存，数据不存在";

    /**
     * 存在下架商品
     */
    public static final Integer STOCK_OFFLINE_CODE = 703;
    public static final String STOCK_OFFLINE_MSG = "商品下架";

    /**
     * 小于最小起订数量
     */
    public static final Integer STOCK_MINSALE_CODE = 704;
    public static final String STOCK_MINSALE_MSG = "购买数量小于最小起订数量";

    /**
     * 小于最小支付金额
     */
    public static final Integer STOCK_MINPAY_CODE = 705;
    public static final String STOCK_MINPAY_MSG = "购买金额小于最小起订金额";

}
