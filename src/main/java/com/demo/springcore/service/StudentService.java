package com.demo.springcore.service;

import com.demo.springcore.model.Student;
import com.demo.springcore.repository.StudentRepo;
import org.springframework.stereotype.Service;
import java.util.List;

public interface StudentService {
    public List<Student> getAllStudent();


    public Student findStudentById(int id);
}

//@Service
//public class StudentService {
//
//    StudentRepo studentRepo;
//    public StudentService()
//    {
//        studentRepo = new StudentRepo();
//    }
//
//    //use repo
//    public List<Student> getAllStudent()
//    {
//        return studentRepo.getStudentList();
//    }
//
//}
