package com.app.dao;

import com.app.entity.OrderDetails;

public interface OrderDetailsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderDetails record);

    int insertSelective(OrderDetails record);

    OrderDetails selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderDetails record);

    int updateByPrimaryKey(OrderDetails record);
}