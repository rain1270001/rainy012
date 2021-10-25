package com.zyy.boot22thymeleaf.controller;

import com.zyy.boot22thymeleaf.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

/**
 * 花间影
 * 16:51
 **/
@Controller
public class MyController {

    @RequestMapping("/demo")
    public String toDome01(Model model) {

        model.addAttribute("name", "华夏");
        model.addAttribute("uid", 10086);
        return "demo01";
    }

    //简单表达式
    @RequestMapping("/exp1")
    public String toexp1(Model model) {

        model.addAttribute("name", "表达式");
        model.addAttribute("value", "test");

        return "exp1";
    }

    //对象表达式
    @RequestMapping("/exp2")
    public String toexp2(Model model) {

        Book book = new Book();
        String str = UUID.randomUUID().toString().replaceAll("-", "").substring(10, 15);
        book.setId(65);
        book.setName("str");
        book.setPrice(15.86);

        model.addAttribute("book", book);

        return "exp1";
    }

    //对象表达式
    @RequestMapping("/exp3")
    public String toexp3(Model model) {

       model.addAttribute("uid", 10086);
        return "exp1";
    }
    //连接表达式
    @GetMapping("/query/user")
    @ResponseBody
    public String queryUser(Integer id){
        return "查询用户,id="+id;
    }

}
