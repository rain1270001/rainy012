package com.zyy.boot10servlet.config;

import com.zyy.boot10servlet.servlet.MyServlet01;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 花间影
 * 19:05
 **/

@Configuration
public class MyapplicationContext {

    //注册servlet
    @Bean
    public ServletRegistrationBean registrationBean() {

        ServletRegistrationBean ret = new ServletRegistrationBean(
                new MyServlet01(), "/login"
        );
        return ret;
    }
}
