package com.app.controller;

import com.app.common.config.WeChatProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    /**
     * @author wangshaobin
     * @date 2018/10/24 19:45
     * @description 页面跳转不做任何操作
     */
    @RequestMapping("/")
    public String main() {
        return "redirect:/login";
    }


    @RequestMapping("/index")
    public String index() {
        // TODO 获取菜单 返回前台进行展示

        return "/index/index";
    }


}
