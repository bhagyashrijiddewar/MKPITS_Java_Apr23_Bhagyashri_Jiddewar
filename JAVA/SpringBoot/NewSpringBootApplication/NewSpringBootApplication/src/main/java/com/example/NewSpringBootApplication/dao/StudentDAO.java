package com.example.NewSpringBootApplication.dao;

import com.example.NewSpringBootApplication.entity.Student;

import java.util.List;

public interface StudentDAO {
    public void save(Student student);
    public Student findByRollNo(Integer rollNo);
    List<Student> findAllStudent(Student student);
   public void deleteRecord(Integer rollNo);
   Student updateRecord(Student student);
}
