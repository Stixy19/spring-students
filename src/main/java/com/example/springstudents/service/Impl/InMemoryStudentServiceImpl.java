package com.example.springstudents.service.Impl;

import com.example.springstudents.model.Student;
import com.example.springstudents.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    @Override
    public List<Student> findAllStudent(){
        return List.of(
                Student.builder().firstName("Anna").email("anna36@gmail.com").age(23).build(),
                Student.builder().firstName("Inna").email("inna36@gmail.com").age(23).build(),
                Student.builder().firstName("Amma").email("amma36@gmail.com").age(23).build()
        );
    };
}
