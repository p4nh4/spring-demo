package com.demo.springcore.service.serviceimpl;

import com.demo.springcore.model.Course;
import com.demo.springcore.repository.CourseRepo;
import com.demo.springcore.service.CourseService;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    CourseRepo courseRepo;
    public CourseServiceImpl()
    {
        courseRepo = new CourseRepo();
    }
    @Override
    public Course getCourseByID(int id) {
        return courseRepo.getCourseByID(id);
    }

    @Override
    public List<Course> getAllCourse() {
        return courseRepo.getAllCourse();
    }

    @Override
    public void addCourse(Course course) {

        courseRepo.addCourse(course);

    }
}
