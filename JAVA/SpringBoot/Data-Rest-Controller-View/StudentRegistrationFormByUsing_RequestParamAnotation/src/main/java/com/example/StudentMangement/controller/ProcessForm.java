package com.example.StudentMangement.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.http.HttpRequest;

@Controller
public class ProcessForm {
    @GetMapping("/index")
    public String display(){
        return "index";
    }
    @PostMapping("/data")
    public String processData(@RequestParam ("rollNo") int rollNo,
                              @RequestParam ("name") String name,
                              @RequestParam ("address") String address,
                              @RequestParam ("city") String city, Model model){

        model.addAttribute("rollNo",rollNo);
        model.addAttribute("name",name);
        model.addAttribute("address",address);
        model.addAttribute("city",city);
        return "DisplayData";
    }
}
