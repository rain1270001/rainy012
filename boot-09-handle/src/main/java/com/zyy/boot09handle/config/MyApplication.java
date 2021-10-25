package com.zyy.boot09handle.config;

import com.zyy.boot09handle.web.MyInterCeptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 花间影
 * 18:34
 **/
//注册拦截器
@Configuration
public class MyApplication implements WebMvcConfigurer {

    //配置拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        String addpath [] ={"/user/**"};//表示拦截user下的所有请求
        String excludePath[]={"/user/login"};//表示不拦截的请求

        registry.addInterceptor(new MyInterCeptor())
                .addPathPatterns(addpath)//这个是要拦截的地址
                .excludePathPatterns(excludePath);//这个是不拦截的地址
    }
}
