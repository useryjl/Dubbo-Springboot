package com.yjl.springboot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yjl.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lele
 * @create 2021-10-05
 */
@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class)
    StudentService studentService;
    
    @RequestMapping("/queryStudentCount")
    @ResponseBody
    public String queryStudentCount(){
        Integer count = studentService.getStudentCount();
        return "学生总数："+count;
    }
}
