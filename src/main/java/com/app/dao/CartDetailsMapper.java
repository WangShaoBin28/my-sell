package com.app.dao;

import com.app.entity.CartDetails;

public interface CartDetailsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CartDetails record);

    int insertSelective(CartDetails record);

    CartDetails selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CartDetails record);

    int updateByPrimaryKey(CartDetails record);
}