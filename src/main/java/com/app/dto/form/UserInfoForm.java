package com.app.dto.form;

import lombok.Data;

import java.io.Serializable;

/**
 * @Package com.app.dto.form
 * @ClassName UserInfoForm
 * @Author wangshaobin
 * @Date 2018/10/24 15:35
 * @Version 1.0
 * @Description:
 **/
@Data
public class UserInfoForm implements Serializable {

    private static final long serialVersionUID = -9182581508618754093L;

    private String userName;

    private String phoneNumber;

    private String password;

    private String openid;

    private String verity;

}
