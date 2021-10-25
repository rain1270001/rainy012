package com.zyy.boot20dubboprovider.serviceImpl;

import com.zyy.pojo.Student;
import com.zyy.service.ProviderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * 花间影
 * 15:04
 **/
@DubboService(interfaceClass = ProviderService.class,version ="1.0.0")
public class StudentImpl implements ProviderService {
    @Override
    public Student getStudent(Integer id) {
        Student s =new Student();
        if (id ==1001){
            s.setId(id);
            s.setName("顾前");
            s.setSex("女");
            s.setAge(24);
        }
        return s;
    }
}
