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

}
