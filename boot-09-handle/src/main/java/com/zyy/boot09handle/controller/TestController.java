package com.zyy.boot09handle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 花间影
 * 18:47
 **/
@RestController
public class TestController {

    @RequestMapping("/user/aaa")
    public String toAAA(){
        return "user/aaa";
    }

    @RequestMapping("/user/login")
    public String toLogin(){
        return "user/login";
    }
}
