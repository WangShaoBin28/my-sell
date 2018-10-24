package com.app.controller;

import com.app.config.WeChatProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Package com.app.controller
 * @ClassName IndexController
 * @Author wangshaobin
 * @Date 2018/10/24 10:58
 * @Version 1.0
 * @Description: index页面
 **/
@Controller
public class IndexController {

    @Autowired
    private WeChatProperties weChatProperties;

    @RequestMapping("/")
    public String index(ModelMap modelMap) {

        modelMap.addAttribute("appId", weChatProperties.getAppId());
        modelMap.addAttribute("secret", weChatProperties.getSecret());
        return "index";
    }


}
