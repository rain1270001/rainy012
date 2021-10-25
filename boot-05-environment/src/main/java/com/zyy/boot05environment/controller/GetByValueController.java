package com.zyy.boot05environment.controller;

import com.zyy.boot05environment.pojo.StudentInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 花间影
 * 10:44
 **/
@RestController
public class GetByValueController {

    @Value("${student.id}")
    private Integer id;

    @Value("${student.name}")
    private String name;

    @Value("${student.address}")
    private String address;

    @Value("${student.skill}")
    private String skill;

    @Resource
    private StudentInfo sInfo;


    @RequestMapping("/value")
    public String getValue(){

        String ret ="读取到的信息:"+id+"<br/>"+name+"<br/>"+address+"<br/>"+skill+";";

        return ret;
    }

    @RequestMapping("/config")
    public String getConfig(){

        String ret =sInfo.toString();

        return ret;
    }

}
