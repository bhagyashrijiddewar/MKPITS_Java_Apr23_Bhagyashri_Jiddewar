package com.example.StudentDetails.rest;

import com.example.StudentDetails.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRest {
    @GetMapping("/students")
    public List<Student> displayStudentList(){
        List<Student> students=new ArrayList<>();
        students.add(new Student(101,"Pranay","Mohan nagar","Nagpur"));
        students.add(new Student(102,"Shubham","Narendra nagar","pune"));
        return students;
    }
    @GetMapping("/student/{studentId}")
    public Student displayStudent(@PathVariable int studentId){
        List<Student> student=new ArrayList<>();
        student.add(new Student(101,"Pranay","Mohan nagar","Nagpur"));
        student.add(new Student(102,"Shubham","Narendra nagar","pune"));
        return student.get(studentId);
    }

}
