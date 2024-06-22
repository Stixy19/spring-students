package com.example.springstudents.service;

import com.example.springstudents.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service


public interface StudentService {

    public List<Student> findAllStudent();
}
