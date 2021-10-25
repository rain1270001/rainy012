package com.zyy.boot14mybatis.service;

import com.zyy.boot14mybatis.dao.StudentMapper;
import com.zyy.boot14mybatis.pojo.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 花间影
 * 14:53
 **/
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentMapper mapper;

    @Transactional(rollbackFor = Exception.class)
    public int addStudnet(Student stu) {
        return mapper.insertStu(stu);
    }

    @Override
    public Student queryStudentById(Integer id) {
        return mapper.selectStudentById(id);
    }
}
