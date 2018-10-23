package com.app.entity;

import java.util.Date;

public class ProductInfo {
    private Long id;

    private String productName;

    private Long categoryId;

    private String unit;

    private Long unitPrice;

    private String detailedDescription;

    private String image;

    private Integer inventoryNum;

    private Date createdGmtAt;

    private Long createId;

    private Date updatedGmtAt;

    private Long updateId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription == null ? null : detailedDescription.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getInventoryNum() {
        return inventoryNum;
    }

    public void setInventoryNum(Integer inventoryNum) {
        this.inventoryNum = inventoryNum;
    }

    public Date getCreatedGmtAt() {
        return createdGmtAt;
    }

    public void setCreatedGmtAt(Date createdGmtAt) {
        this.createdGmtAt = createdGmtAt;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Date getUpdatedGmtAt() {
        return updatedGmtAt;
    }

    public void setUpdatedGmtAt(Date updatedGmtAt) {
        this.updatedGmtAt = updatedGmtAt;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }
}