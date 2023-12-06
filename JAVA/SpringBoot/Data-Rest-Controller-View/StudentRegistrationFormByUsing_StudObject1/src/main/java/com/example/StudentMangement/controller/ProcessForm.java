package com.example.StudentMangement.controller;

import com.example.StudentMangement.entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.http.HttpRequest;

@Controller
public class ProcessForm {
    @GetMapping("/index")
    public String display(Model model){
//        Student student=new Student();
//        model.addAttribute("stud",student);
        return "index";
    }
    @PostMapping("/data")
    public String processData(@ModelAttribute("stud") Student studentData, Model model){
        return "DisplayData";
    }
}
