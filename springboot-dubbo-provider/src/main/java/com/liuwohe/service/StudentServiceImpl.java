package com.liuwohe.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.liuwohe.mapper.StudentMapper;
import com.liuwohe.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
//@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000)
//public class StudentServiceImpl implements StudentService {
//
//    @Autowired
//    private StudentMapper studentMapper;
//
//    @Override
//    public Student selectById(Integer id) {
//        return studentMapper.selectByPrimaryKey(id);
//    }
//}
@Component
@Service(interfaceClass = StudentService.class,version="1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
