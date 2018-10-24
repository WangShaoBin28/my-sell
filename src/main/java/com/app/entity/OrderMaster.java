package com.app.entity;

import com.app.common.utils.BaseEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class OrderMaster extends BaseEntity implements Serializable {

    private String orderNum;

    private Long userId;

    private Long totalAmount;

    private Integer paymentStatus;

}