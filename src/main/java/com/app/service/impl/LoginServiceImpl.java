package com.app.service.impl;

import com.app.common.consts.ConstsCode;
import com.app.common.utils.ErrorUtils;
import com.app.common.utils.ReturnInfo;
import com.app.dao.UserInfoMapper;
import com.app.dto.form.UserInfoForm;
import com.app.entity.UserInfo;
import com.app.service.LoginService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * @Package com.app.service.impl
 * @ClassName LoginServiceImpl
 * @Author wangshaobin
 * @Date 2018/10/24 15:47
 * @Version 1.0
 * @Description:
 **/
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * @author wangshaobin
     * @date 2018/10/24 15:49
     * @description 进行对账号密码的校验
     */
    @Override
    public ReturnInfo<UserInfo> checkLogin(UserInfoForm userInfoForm, HttpServletRequest request) {
        ReturnInfo<UserInfo> returnInfo = new ReturnInfo<>();

        //非法参数
        if (userInfoForm == null) {
            returnInfo.setStatus(false);
            returnInfo.setError(ErrorUtils.ILLEGAL_ERROR);
            return returnInfo;
        }

        //根据手机号进行查询
        UserInfo userInfo = userInfoMapper.selectByPhoneNumber(userInfoForm);

        if (userInfo == null) {
            returnInfo.setStatus(false);
            returnInfo.setError(ErrorUtils.PHONE_NUMBER_IS_NULL_ERROR);
            return returnInfo;
        }
        HttpSession session = request.getSession();
        Object verityCode = session.getAttribute("verityCode");

        if (verityCode == null) { //验证码不存在或者过期
            returnInfo.setStatus(false);
            returnInfo.setError(ErrorUtils.VERITY_CODE_EXPIRED_ERROR);
            return returnInfo;
        } else if (!verityCode.equals(userInfoForm.getVerity())) { //验证码不正确
            returnInfo.setStatus(false);
            returnInfo.setError(ErrorUtils.INCORRECT_VERIFICATION_CODE_ERROR);
            return returnInfo;
        }

        //判断密码是否正确
        if (userInfo.getPassword().equals(userInfoForm.getPassword())) {
            returnInfo.setStatus(false);
            returnInfo.setError(ErrorUtils.PASSWORD_ERROR);
            return returnInfo;
        }

        returnInfo.setContent(userInfo);

        return returnInfo;
    }
}
