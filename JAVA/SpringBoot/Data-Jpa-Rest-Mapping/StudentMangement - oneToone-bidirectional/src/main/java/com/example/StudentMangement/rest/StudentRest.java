package com.example.StudentMangement.rest;

import com.example.StudentMangement.entity.Address;
import com.example.StudentMangement.entity.Student;
import com.example.StudentMangement.services.StudentService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRest {
    private StudentService studentService;

    @Autowired
    public StudentRest(StudentService studentService) {
        this.studentService = studentService;
    }
//    ---------- Display all student data ---------------

    @GetMapping("/students")
    public List<Student> displayStudentList(){
       return   studentService.findAllStudentList();
    }

    //    ------------- Display particular student data ---------------

    @GetMapping("/students/{roll_no}")
    public Student displayStudent(@PathVariable("roll_no") Integer roll_no){
       return studentService.findStudentByRollNO(roll_no);

    }

    //    ---------- Display inserted student data ---------------

    @PostMapping("/students")
    public String insertStudentRecord(@RequestBody Student student){
        return studentService.insertData(student);
    }

    //    ---------- Delete student data ----------------------
    @DeleteMapping("/students/{roll_no}")
    public String deleteStudentData(@PathVariable Integer roll_no){
        return studentService.deleteStudentData(roll_no);
    }





}
