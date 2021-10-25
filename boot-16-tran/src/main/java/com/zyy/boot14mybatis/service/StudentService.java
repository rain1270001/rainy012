package com.zyy.boot14mybatis.service;

import com.zyy.boot14mybatis.pojo.Student;

/**
 * 花间影
 * 14:52
 **/
public interface StudentService {
    int addStudnet(Student stu);
    Student queryStudentById(Integer id);
}
