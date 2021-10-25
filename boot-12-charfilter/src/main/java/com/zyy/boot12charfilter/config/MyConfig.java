package com.zyy.boot12charfilter.config;

import com.zyy.boot12charfilter.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * 花间影
 * 19:49
 **/
@Configuration
public class MyConfig {

    @Bean
    public ServletRegistrationBean servlet(){
        ServletRegistrationBean ret =new ServletRegistrationBean(
                new MyServlet(),"/login"
        );
        return ret;
    }

    @Bean
    public FilterRegistrationBean registrationBean(){
        FilterRegistrationBean ret =new FilterRegistrationBean();

        CharacterEncodingFilter charset =new CharacterEncodingFilter();
        //设置编码格式
        charset.setEncoding("utf-8");
        //强制请求和相应都是用统一编码集
        charset.setForceEncoding(true);

        //进行注册
        ret.setFilter(charset);
        ret.addUrlPatterns("/*");

        return ret;
    }
}
