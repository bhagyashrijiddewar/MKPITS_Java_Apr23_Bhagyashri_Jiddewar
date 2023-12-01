package com.example.CrudOperationUsingJPA.services;

import com.example.CrudOperationUsingJPA.entity.Student;

public interface StudentService {
    String insertData(Student student);
    Student updateRecord(Student student);
    String deleteStudentRecord(Integer roll_no);
}
