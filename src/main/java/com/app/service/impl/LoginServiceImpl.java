package com.app.service.impl;

import com.app.common.consts.ConstCode;
import com.app.common.utils.ReturnInfo;
import com.app.dao.UserInfoMapper;
import com.app.dto.form.UserInfoForm;
import com.app.entity.UserInfo;
import com.app.service.LoginService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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

        //非法参数
        if (userInfoForm == null) {
            return new ReturnInfo<>(null, ConstCode.PARAMS_ERR_CODE, ConstCode.PARAMS_ERR_MSG, false);
        }

        //根据手机号进行查询
        UserInfo userInfo = userInfoMapper.selectByPhoneNumber(userInfoForm);

        if (userInfo == null) {
            return new ReturnInfo<>(null,  ConstCode.NO_REGISTERED_CODE, ConstCode.NO_REGISTERED_MSG, false);
        }
        //暂时去掉验证码
//        HttpSession session = request.getSession();
//        Object verityCode = session.getAttribute("verityCode");
//
//        if (verityCode == null) { //验证码不存在或者过期
//            return new ReturnInfo<>(null, 1, ErrorUtils.VERITY_CODE_EXPIRED_ERROR, false);
//        } else if (!verityCode.equals(userInfoForm.getVerity())) { //验证码不正确
//            return new ReturnInfo<>(null, 1, ErrorUtils.INCORRECT_VERIFICATION_CODE_ERROR, false);
//        }

        //判断密码是否正确
        if (!userInfo.getPassword().equals(userInfoForm.getPassword())) {
            return new ReturnInfo<>(null, ConstCode.PASSWORD_INCORRECT_CODE, ConstCode.PASSWORD_INCORRECT_MSG, false);
        }

        return new ReturnInfo<>(userInfo);
    }


}
