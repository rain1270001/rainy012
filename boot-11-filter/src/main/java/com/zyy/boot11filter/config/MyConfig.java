package com.zyy.boot11filter.config;

import com.zyy.boot11filter.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * 花间影
 * 19:15
 **/
//注册过滤器
@Configuration
public class MyConfig {

    @Bean
    public FilterRegistrationBean RegistrationBean(){

        FilterRegistrationBean ret =new FilterRegistrationBean();

        //决定使用哪个过滤器
        ret.setFilter(new MyFilter());
        //设置过滤器的地址
        ret.addUrlPatterns("/user/*");

        return ret;
    }
}
