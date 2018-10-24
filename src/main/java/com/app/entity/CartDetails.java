package com.app.entity;

import com.app.common.utils.BaseEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class CartDetails extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 8708877977605768711L;

    private Long cartId;

    private Long productId;


}