package com.zyy.boot04torunning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 花间影
 * 21:31
 **/
@Controller
public class FirstController {
    @RequestMapping("/test")
    @ResponseBody
    public String getString(){
        String ret ="赵客缦胡缨";
        return ret;
    }
}
