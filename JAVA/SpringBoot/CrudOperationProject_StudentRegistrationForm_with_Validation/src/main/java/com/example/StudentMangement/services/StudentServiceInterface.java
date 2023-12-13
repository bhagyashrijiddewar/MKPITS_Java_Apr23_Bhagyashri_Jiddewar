package com.example.StudentMangement.services;

import com.example.StudentMangement.entity.Student;

import java.util.List;

public interface StudentServiceInterface {
    List<Student> findAllStudentData();
    String insertStudentData(Student student);
}
