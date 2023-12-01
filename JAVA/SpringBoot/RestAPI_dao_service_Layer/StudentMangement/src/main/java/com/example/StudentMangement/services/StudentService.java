package com.example.StudentMangement.services;

import com.example.StudentMangement.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudentList();
    Student findStudent(Integer roll_no);
    String insertData(Student student);
    Student updateRecord(Student student);
    String deleteStudentRecord(Integer roll_no);



}
