package com.demo.springcore.configuration;

import com.demo.springcore.service.CourseService;
import com.demo.springcore.service.serviceimpl.CourseServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public CourseService getCourseService()
    {
        return new CourseServiceImpl();
    }
}
