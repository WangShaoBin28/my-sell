package com.app.entity;

import com.app.utils.BaseEntity;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfo extends BaseEntity implements Serializable {

    private String userName;

    private String phoneNumber;

    private String password;

    private String openid;


}