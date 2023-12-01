package com.example.CrudOperationUsingJPA.rest;

import com.example.CrudOperationUsingJPA.entity.Student;
import com.example.CrudOperationUsingJPA.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
public class StudentRest {
    private StudentService studentService;

    @Autowired
    public StudentRest(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/students")
    public String insertStudentRecord(@RequestBody Student student){
        return studentService.insertData(student);
    }
    @PutMapping("/students")
    public Student updateStudentRecord(@RequestBody Student student){
        return studentService.updateRecord(student);
    }
    @DeleteMapping("/students/{roll_no}")
    public String deleteStudentRecord(@RequestBody @PathVariable Integer roll_no){
        return studentService.deleteStudentRecord(roll_no);
    }
}
