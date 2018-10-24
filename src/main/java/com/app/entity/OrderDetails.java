package com.app.entity;

import com.app.common.utils.BaseEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class OrderDetails extends BaseEntity implements Serializable {


    private Long orderId;

    private Long productId;

}