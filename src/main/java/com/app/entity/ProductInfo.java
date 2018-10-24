package com.app.entity;

import com.app.utils.BaseEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class ProductInfo extends BaseEntity implements Serializable {

    private String productName;

    private Long categoryId;

    private String unit;

    private Long unitPrice;

    private String detailedDescription;

    private String image;

    private Integer inventoryNum;

}