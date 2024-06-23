package com.example.springstudents.service;

import com.example.springstudents.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service


public interface StudentService {

    public List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
