package com.example.StudentMangement.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.http.HttpRequest;

@Controller
public class ProcessForm {
    @GetMapping("/index")
    public String display(){
        return "index";
    }
    @GetMapping("/data")
    public String processData(HttpServletRequest httpRequest, Model model){
        int rollNo= Integer.parseInt(httpRequest.getParameter("rollNo"));
        System.out.println(rollNo);
        String name= httpRequest.getParameter("name");
        String address= httpRequest.getParameter("address");
        String city= httpRequest.getParameter("city");

        model.addAttribute("rollNo",rollNo);
        model.addAttribute("name",name);
        model.addAttribute("address",address);
        model.addAttribute("city",city);
        return "DisplayData";
    }
}
