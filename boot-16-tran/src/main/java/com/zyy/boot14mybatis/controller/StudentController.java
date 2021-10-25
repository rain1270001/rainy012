package com.zyy.boot14mybatis.controller;

import com.zyy.boot14mybatis.pojo.Student;
import com.zyy.boot14mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 花间影
 * 14:55
 **/
@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @RequestMapping("/query")
    public String getQueryById(Integer id) {
        Student student = service.queryStudentById(id);
        String ret = student.toString();
        return ret;
    }

    @RequestMapping("/insert")
    public String getInsert(Student stu) {
        int i = service.addStudnet(stu);

        return i > 0 ? "添加成功" : "添加失败";

    }
}
