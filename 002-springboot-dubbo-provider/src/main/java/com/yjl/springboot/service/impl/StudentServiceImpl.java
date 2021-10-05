package com.yjl.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yjl.service.StudentService;
import org.springframework.stereotype.Component;

/**
 * @author lele
 * @create 2021-10-05
 */
@Component
@Service(interfaceClass = StudentService.class)
public class StudentServiceImpl implements StudentService {
    @Override
    public Integer getStudentCount() {
        return 1250;
    }
}
