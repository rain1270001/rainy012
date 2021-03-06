package com.zyy.boot21dubobocustomer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class Boot21DuboboCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot21DuboboCustomerApplication.class, args);
    }

}
