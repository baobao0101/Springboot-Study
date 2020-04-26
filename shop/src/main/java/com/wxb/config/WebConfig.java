package com.wxb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ProjectName shop
 * @ClassName WebConfig
 * @Date 2020/3/5 13:04
 * @Author wangxiaobao
 * @Version 1.0
 */
//配置类
@Configuration
public class WebConfig implements WebMvcConfigurer {
//    配置默认跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/index").setViewName("index");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/image/**").addResourceLocations("file:C:\\Users\\xiaobao\\Pictures\\Saved Pictures\\");
    }
}
