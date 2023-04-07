package com.demo.springcore.controller;

import com.demo.springcore.model.Student;
import com.demo.springcore.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    StudentService studentService;
    @Autowired
    StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }
    @GetMapping("/student")
    public List<Student> getAllStudent()
    {
        return studentService.getAllStudent();

    }

}
