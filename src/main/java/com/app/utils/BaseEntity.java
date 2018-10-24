package com.app.utils;

import lombok.Data;

import java.util.Date;

/**
 * @Package com.app.base
 * @ClassName BaseEntity
 * @Author wangshaobin
 * @Date 2018/10/23 20:01
 * @Version 1.0
 * @Description:
 **/
@Data
public class BaseEntity {

    private Long id;

    private Date createdGmtAt;

    private Long createId;

    private Date updatedGmtAt;

    private Long updateId;
}
