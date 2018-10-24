package com.app.entity;

import com.app.common.utils.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ProductCategory extends BaseEntity implements Serializable {

    private String categoryName;

    private Date createdGmtAt;
}