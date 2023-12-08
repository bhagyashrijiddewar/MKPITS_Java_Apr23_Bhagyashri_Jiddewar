package com.example.StudentMangement.controller;

import com.example.StudentMangement.entity.Student;
import com.example.StudentMangement.services.StudentServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    private StudentServices studentServices;

    @Autowired
    public StudentController(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @GetMapping("/list")
    public String displayAllStudentList(Model model){
       List<Student> studentList=studentServices.findAllStudentData();
       model.addAttribute("studentList",studentList);
        return "homepage";
    }
    @GetMapping("/register")
    public String insertStudentRecord(Model model){
        Student student=new Student();
        model.addAttribute("student",student);
        return "index";
    }
    @PostMapping("/save")
    public String processData(@ModelAttribute("student") Student studentData){
           studentServices.insertStudentData(studentData);
            return "redirect:/students/list";
    }
}
