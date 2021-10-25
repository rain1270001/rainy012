package com.zyy.boot12charfilter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 花间影
 * 15:48
 **/
@Controller
public class MyController {

    @RequestMapping("/test")
    @ResponseBody
    public String toTest(){
        System.out.println(1231654);
        return "this is a 测试卷";
    }
}
