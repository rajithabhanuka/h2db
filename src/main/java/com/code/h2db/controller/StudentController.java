package com.code.h2db.controller;

import com.code.h2db.entity.Student;
import com.code.h2db.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/students")
    public void Save(@RequestBody Student student){
        studentService.save(student);
    }

    @GetMapping(value = "/students")
    public List<Student> getStudents(){
        return studentService.findALl();
    }
}
