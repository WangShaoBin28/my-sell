package com.app.entity;

import com.app.common.utils.BaseEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class CartInfo extends BaseEntity implements Serializable {

    private Long userId;


}