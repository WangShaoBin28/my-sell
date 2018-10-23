package com.app.dao;

import com.app.entity.OrderMaster;

public interface OrderMasterMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderMaster record);

    int insertSelective(OrderMaster record);

    OrderMaster selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderMaster record);

    int updateByPrimaryKey(OrderMaster record);
}