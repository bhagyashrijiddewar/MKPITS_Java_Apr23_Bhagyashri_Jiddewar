package com.example.NewSpringBootApplication.dao;

import com.example.NewSpringBootApplication.entity.Student;

public interface StudentDAO {
    public void save(Student student);
    public Student findByRollNo(Integer rollNo);
   public void deleteRecord(Integer rollNo);
   Student updateRecord(Student student);
}
