package com.app.entity;

import java.util.Date;

public class ProductCategory {
    private Long id;

    private String categoryName;

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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
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