package com.app.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Package com.app.config
 * @ClassName WeChat
 * @Author wangshaobin
 * @Date 2018/10/24 10:55
 * @Version 1.0
 * @Description:
 **/
@Component
@ConfigurationProperties(prefix="wechat")
@Data
public class WeChatProperties {

    private String appId;

    private String secret;

}
