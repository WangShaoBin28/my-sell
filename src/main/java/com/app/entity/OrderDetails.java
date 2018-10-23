package com.app.entity;

import com.app.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class OrderDetails extends BaseEntity implements Serializable {


    private Long orderId;

    private Long productId;

}