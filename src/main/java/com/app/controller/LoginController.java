package com.app.controller;

import com.app.dto.form.UserInfoForm;
import com.app.entity.UserInfo;
import com.app.service.LoginService;
import com.app.common.utils.ReturnInfo;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Package com.app.controller
 * @ClassName LoginController
 * @Author wangshaobin
 * @Date 2018/10/24 15:16
 * @Version 1.0
 * @Description: 登入页面（包含手机端和PC端）
 **/
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * @author wangshaobin
     * @date 2018/10/24 15:19
     * @description 跳转登录页面
     */
    @GetMapping("/login")
    public String login() {
        //检查是否有登入，有登入直接跳转 TODO
      //暂时把登入的ID放入cookie

        return "login/login";
    }

    /**
     * @author wangshaobin
     * @date 2018/10/24 16:33
     * @description 异步检查登入
     */
    @PostMapping("/checkLogin")
    @ResponseBody
    public ReturnInfo<UserInfo> checkLogin(@RequestBody UserInfoForm userInfoForm, HttpServletRequest request) {
        return loginService.checkLogin(userInfoForm, request);
    }

}
