package com.code.h2db.service;

import com.code.h2db.entity.Student;

import java.util.List;

public interface StudentService {

    void save(Student student);

    List<Student> findALl();

}
