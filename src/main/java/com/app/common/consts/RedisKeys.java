package com.app.common.consts;

/**
 * Created by Administrator on 2016/12/12 0012.
 */
public final class RedisKeys {

    /**
     * 今日推荐商品Redis键
     */
    public final static String GOODS_RECOMMENDED_REDIS_KEY = "GOODS_RECOMMEND_KEY";

    /**
     * 用户地址Redis前缀
     */
    public final static String USER_AD_REDIS_KEY = "USER_AD_BY_UID.";

    /**
     * 用户默认地址
     */
    public final static String USER_AD_DEFUALT_REDIS_KEY = "USER_AD_DEFAULT_BY_UID.";

    /**
     * 订单超时队列redis键
     */
    public final static String ORDER_TIMEOUT_LIST_REDIS_KEY = "ORDER_TIMEOUT_LIST_KEY";

    /**
     * 订单支付HASH对象redis键
     */
    public final static String ORDER_PAY_HASH_REDIS_KEY = "ORDER_PAY_COMP_HASH_KEY";

    /**
     * 订单分页Redis前缀
     */
    public final static String ORDER_REDIS_KEY = "ORDERS_BY_UID_S_P.";

    /**
     * 订单编号使用索引
     */
    public final static String ORDER_INDEX_REDIS_KEY = "ORDER_INDEX_KEY";

    /**
     * 订单取消使用Redis键
     */
    public final static String ORDER_CANCEL_LOCK_REDIS_KEY = "ORDER_CANCEL_KEY";

    /**
     * 商品分类Redis键
     */
    public final static String CATEGORY_CACHE_KEY = "CATEGORY_CACHE_KEY";


}
