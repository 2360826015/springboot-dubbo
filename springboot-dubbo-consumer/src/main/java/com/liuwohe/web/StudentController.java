package com.liuwohe.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liuwohe.model.Student;
import com.liuwohe.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
    private StudentService studentService;

    @GetMapping("/studentDetil/{id}")
    public String studentDetil(Model model,
                               @PathVariable("id") Integer id){
        Student student = studentService.queryStudentById(id);
        model.addAttribute("student",student);
        return "studentDetil";
    }
}
