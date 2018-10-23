package com.app.entity;

import java.util.Date;

public class OrderMaster {
    private Long id;

    private String orderNum;

    private Long userId;

    private Long totalAmount;

    private Integer paymentStatus;

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

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
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