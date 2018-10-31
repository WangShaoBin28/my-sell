package com.app.controller;

import com.app.common.config.WeChatProperties;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Package com.app.controller
 * @ClassName IndexController
 * @Author wangshaobin
 * @Date 2018/10/24 10:58
 * @Version 1.0
 * @Description: index页面
 **/
@Api("管理基础功能")
@Controller
public class IndexController {

    @Autowired
    private WeChatProperties weChatProperties;

    /**
     * @author wangshaobin
     * @date 2018/10/24 19:45
     * @description 页面跳转不做任何操作
     */
    @ApiOperation("页面跳转不做任何操作")
    @GetMapping("/")
    public String main() {
        return "redirect:/login";
    }


    @GetMapping("/index")
    public String index() {
        // TODO 获取菜单 返回前台进行展示

        return "/index/index";
    }

    @GetMapping("/welcome")
    public String welcome() {


        return "/index/welcome";
    }

    /**
     * @author wangshaobin
     * @date 2018/10/25 15:28
     * @description 系统设置页面
     */
    @GetMapping("/system")
    public String system() {


        return "/system/system";
    }

    /**
     * @author wangshaobin
     * @date 2018/10/25 15:28
     * @description 系统设置页面 backupDb
     */
    @GetMapping("/adminInfo")
    public String adminInfo() {


        return "/admin/admin-info";
    }

    /**
     * @author wangshaobin
     * @date 2018/10/25 15:28
     * @description 备份数据库
     */
    @GetMapping("/backupDb")
    public String backupDb() {


        return "/backup/backupDb";
    }


}
