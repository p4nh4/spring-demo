package com.demo.springcore.repository;

import com.demo.springcore.model.Student;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    List<Student> studentList = new ArrayList<>(){{
        for(int i=0;i<10 ;i++)
        {
            Faker obj = new Faker();
            add(new Student(obj.idNumber().hashCode(),obj.funnyName().name(),"male",obj.number().randomNumber()));
        }

//        add(new Student(101,"cai","male",89 ));
//        add(new Student(202,"kai","female",89 ));
    }};

    public List<Student> getAllStudent(){
        return studentList;
    }

    public Student getStudentByID(int id)
    {
        return studentList.stream().filter((student -> student.id == id))
                .findFirst().orElse(null);
    }
}
