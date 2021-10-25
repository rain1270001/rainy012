package com.zyy.boot14mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* @mapperScan 可以使用value 或者basePackages来指定包名;多个包名之间使用逗号隔开*/
@MapperScan({"com.zyy.boot14mybatis.dao","com.zyy.boot14mybatis.controller"} )
@SpringBootApplication
public class Boot14MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot14MybatisApplication.class, args);
    }

}
