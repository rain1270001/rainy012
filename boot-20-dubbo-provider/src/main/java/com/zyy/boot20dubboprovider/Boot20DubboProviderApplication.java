package com.zyy.boot20dubboprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动服务的注解
@EnableDubbo
@SpringBootApplication
public class Boot20DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot20DubboProviderApplication.class, args);
    }

}
