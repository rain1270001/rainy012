package com.zyy.temp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 花间影
 * 10:07
 **/
@Controller
public class TestController {

    @Value("${server.port}")
    private String port;

    @Value("${server.servlet.context-path}")
    private String context;

    @RequestMapping("/myweb")
    @ResponseBody
    public String getWeb(String name){

        String ret ="这是一个测试用的:"+port+","+context;
        return ret ;
    }
}
