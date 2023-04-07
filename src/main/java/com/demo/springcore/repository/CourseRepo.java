package com.demo.springcore.repository;

import com.demo.springcore.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepo {
    List<Course> allCourse = new ArrayList<>(){{
        add(new Course(1001, "java","2M"));
        add(new Course(1002, "spring","3M"));
        add(new Course(1003, "HTML","1.5M"));
    }};
    public void addCourse( Course course)
    {
        allCourse.add(course);
    }
    public Course getCourseByID(int id)
    {
        return allCourse.stream()
                .filter((course -> course.courseID == id)).findFirst()
                .orElse(null);
    }
    public List<Course> getAllCourse()
    {
        return allCourse;
    }

}
