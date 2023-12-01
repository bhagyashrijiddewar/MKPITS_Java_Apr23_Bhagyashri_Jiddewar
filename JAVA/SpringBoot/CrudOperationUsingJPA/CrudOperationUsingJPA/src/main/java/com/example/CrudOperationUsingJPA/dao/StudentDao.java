package com.example.CrudOperationUsingJPA.dao;

import com.example.CrudOperationUsingJPA.entity.Student;

public interface StudentDao {
    String insertData(Student student);
    Student updateRecord(Student student);
    String deleteStudentRecord(Integer roll_no);

}
