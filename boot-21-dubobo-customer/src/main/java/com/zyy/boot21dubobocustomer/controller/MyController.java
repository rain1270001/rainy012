package com.zyy.boot21dubobocustomer.controller;

import com.zyy.pojo.Student;
import com.zyy.service.ProviderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 花间影
 * 15:52
 **/
@RestController
public class MyController {

    @DubboReference(version = "1.0.0")
    private ProviderService service;

    @RequestMapping("/customer")
    public String myWeb(Integer id){

        Student student = service.getStudent(id);
        String ret =student.toString();
        return ret;
    }
}
