package com.demo.springcore.model;

import com.demo.springcore.service.StudentService;

import java.util.List;

public class Testing {
    public static void main(String[] args) {
        StudentService studentService = new StudentService() {
            @Override
            public List<Student> getAllStudent() {
                return null;
            }

            @Override
            public Student findStudentById(int id) {
                return null;
            }
        };

        System.out.println("Student List");
        studentService.getAllStudent().forEach(System.out::println);
    }
}
