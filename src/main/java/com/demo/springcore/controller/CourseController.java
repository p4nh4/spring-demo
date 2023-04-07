package com.demo.springcore.controller;

import com.demo.springcore.model.Course;
import com.demo.springcore.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    //injection course
    CourseService courseService;
    @Autowired
    CourseController(CourseService courseService)
    {
        this.courseService = courseService;
    }
    @GetMapping("/course")
    public List<Course> getAllCourse()
    {
        return courseService.getAllCourse();
    }
}
