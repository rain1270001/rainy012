package com.zyy.controller;

import com.zyy.service.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 花间影
 * 13:56
 **/
@Controller
public class Mycontroller {

    @Resource
    private WeatherService service;

    @GetMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password, HttpServletRequest request,Model model){

        String addr =request.getRemoteAddr();
        System.out.println("地址"+addr);
        String host =request.getRemoteHost();
        System.out.println("ip"+host);

        //根据ip找到城市
        String city="101010100";
        String weather = service.getWeather(city);

        model.addAttribute("weather", weather);
        model.addAttribute("name", username);

        return  "main";

    }
}
