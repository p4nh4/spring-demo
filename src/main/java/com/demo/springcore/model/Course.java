package com.demo.springcore.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {
    public int courseID;
    public String courseName;
    public String courseDuration;
}
