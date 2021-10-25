package com.zyy.boot17restful.controller;

import org.springframework.web.bind.annotation.*;

/**
 * 花间影
 * 21:12
 **/
@RestController
public class MyController {

    //getmapping就相当于使用@RequestMapping(method = RequestMethod.GET)
    //地址上要使用名词 get 方式表示查询
    @GetMapping("/student/{studentId}")
    public String toStudent(@PathVariable(value = "studentId") Integer id) {
        return "请求方式为get,获取到学生的id:"+id;
    }

    @GetMapping("/student/{studentId}/{studentName}")
    public String toMore(@PathVariable(value = "studentId") Integer id,@PathVariable(value = "studentName") String name) {
        return "请求方式为get,获取到学生的id:"+id+",姓名"+name;
    }


   /* @PostMapping("/class/{classId}/student/{studentId}")
    public String toPost(@PathVariable(value = "classId") Integer cId,@PathVariable(value = "studentId") Integer sId){

        return "班级编号:"+cId+",学生编号:"+sId;
    }*/


    //post方式表示添加,增加
    @PostMapping("/class/{classId}/student/{studentId}")
    public String toPost02(@PathVariable(value = "classId") Integer cId,@PathVariable(value = "studentId") Integer sId,String name){

        return "班级编号:"+cId+",学生编号:"+sId+",学生姓名"+name;
    }


    //put方法用于修改
    @PutMapping("/put/student/{id}/{name}/{sex}")
    public String toPut(@PathVariable Integer id,@PathVariable String name,@PathVariable String sex){

        return "学生信息:"+"<br/>编号:"+id+"<br/>姓名:"+name+";<br/>性别:"+sex;
    }

}
