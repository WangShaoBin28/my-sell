package com.app.entity;

import com.app.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class CartInfo extends BaseEntity implements Serializable {

    private Long userId;


}