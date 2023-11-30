package com.example.StudentMangement.rest;

import com.example.StudentMangement.entity.Student;
import com.example.StudentMangement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRest {
    private StudentService studentService;

    @Autowired
    public StudentRest(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> displayStudentList(){
        return studentService.findAllStudentList();
    }
    @GetMapping("/student/{roll_no}")
    public Student displayStudent(@PathVariable Integer roll_no){
        return studentService.findStudent(roll_no);
    }
}
