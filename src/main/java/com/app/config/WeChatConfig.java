package com.app.config;

import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Package com.app.config
 * @ClassName WeChatConfig
 * @Author wangshaobin
 * @Date 2018/10/24 10:40
 * @Version 1.0
 * @Description: 第三方插件微信配置
 **/
@Component
public class WeChatConfig {

//    @Autowired
//    private WeChatProperties weChatProperties;
//
//    @Bean
//    public WxMpService wxMpService() {
//        WxMpService wxMpService = new WxMpServiceImpl();
//        wxMpService.setWxMpConfigStorage(wxMpConfigStorage());
//        return wxMpService;
//    }
//
//    @Bean
//    public WxMpConfigStorage wxMpConfigStorage() {
//        WxMpInMemoryConfigStorage wxMpConfigStorage = new WxMpInMemoryConfigStorage();
//        wxMpConfigStorage.setAppId(weChatProperties.getAppId());
//        wxMpConfigStorage.setSecret(weChatProperties.getSecret());
//        return wxMpConfigStorage();
//    }
}
