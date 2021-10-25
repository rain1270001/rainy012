package com.zyy.boot14mybatis.dao;

import com.zyy.boot14mybatis.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * 花间影
 * 14:45
 **/
/*
* @mapper注解,告诉mybatis当前类是一个dao类接口,需要创建代理对象
* 在使用到的dao接口特别多时,可以使用其改进方法@mapperscan在启动类进行注解
* @mapper和@mapperscan不可以同时使用,只能选择其中的一个使用*/
//@Mapper
public interface StudentMapper {
    int insertStu(Student stu);

    Student selectStudentById(Integer id);
}
