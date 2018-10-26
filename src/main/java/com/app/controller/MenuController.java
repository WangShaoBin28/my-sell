package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Package com.app.controller
 * @ClassName MenuController
 * @Author wangshaobin
 * @Date 2018/10/26 11:55
 * @Version 1.0
 * @Description: 菜单管理
 **/
@Controller
public class MenuController {

    /**
     * @author wangshaobin
     * @date 2018/10/26 11:56
     * @description 前台
     */
    @RequestMapping("/afterMenu")
    public String afterMenu() {

        return "/menu/afterMenu.ftl";
    }

    /**
     * @author wangshaobin
     * @date 2018/10/26 11:56
     * @description 后台
     */
    @RequestMapping("/beforeMenu")
    public String beforeMenu() {

        return "/menu/beforeMenu.ftl";
    }


}
