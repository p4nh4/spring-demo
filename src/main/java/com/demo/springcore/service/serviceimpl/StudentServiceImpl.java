package com.demo.springcore.service.serviceimpl;

import com.demo.springcore.model.Student;
import com.demo.springcore.repository.StudentRepo;
import com.demo.springcore.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    //Repo
    StudentRepo studentRepo;
    StudentServiceImpl(){
        studentRepo = new StudentRepo();
    }
    @Override
    public List<Student> getAllStudent() {
        return studentRepo.getAllStudent();
    }

    @Override
    public Student findStudentById(int id) {
        return studentRepo.getStudentByID(id);
    }
//    @Override
//    public List<Student> getStudentList() {
//        return studentRepo.getStudentList();
//    }
//    @Override
//    public Student findStudentById(int id) {
//        return studentRepo.getStudentByID(id);
//    }
}
