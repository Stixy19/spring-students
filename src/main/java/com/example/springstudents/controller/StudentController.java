package com.example.springstudents.controller;

import com.example.springstudents.model.Student;
import com.example.springstudents.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;




@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor

public class StudentController {
    private final StudentService service;
    @GetMapping
    public List<Student> findAllStudent() {
        //todo
        return service.findAllStudent();
    }
}
