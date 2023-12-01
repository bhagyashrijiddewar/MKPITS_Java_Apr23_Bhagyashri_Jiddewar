package com.example.StudentMangement.dao;

import com.example.StudentMangement.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAllRecordsOfStudent();
    Student findStudent(Integer roll_no);
    String insertData(Student student);
    Student updateRecord(Student student);
    String deleteStudentRecord(Integer roll_no);
}
