package com.zyy.boot08config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//实现commandlinerunner或者ApplicationRunner来获取容器
@SpringBootApplication
public class Boot08ConfigApplication implements CommandLineRunner{

    public static void main(String[] args) {
        System.out.println("main执行");
        SpringApplication.run(Boot08ConfigApplication.class, args);
        System.out.println("run执行");
    }

    //获取容器,该方法在主方法执行之后就会执行 可以用来做初始化的操作
    @Override
    public void run(String... args) throws Exception {

        System.out.println("CommandLineRunner的run方法执行");

    }
}
