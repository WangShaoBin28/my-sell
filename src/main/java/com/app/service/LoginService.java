package com.app.service;

import com.app.dto.form.UserInfoForm;
import com.app.entity.UserInfo;
import com.app.common.utils.ReturnInfo;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;

/**
 * @Package com.app.service
 * @ClassName LoginService
 * @Author wangshaobin
 * @Date 2018/10/24 15:47
 * @Version 1.0
 * @Description:
 **/
public interface LoginService {

    /**
     * @author wangshaobin
     * @date 2018/10/24 15:48
     * @description 检查登入
     */
    ReturnInfo<UserInfo> checkLogin(UserInfoForm userInfoForm, HttpServletRequest request);
}
