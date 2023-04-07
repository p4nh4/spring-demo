package com.demo.springcore.service;

import com.demo.springcore.model.Course;

import java.util.List;

public interface CourseService {
    Course getCourseByID (int id);
    List<Course> getAllCourse();
    void addCourse(Course course);
}
