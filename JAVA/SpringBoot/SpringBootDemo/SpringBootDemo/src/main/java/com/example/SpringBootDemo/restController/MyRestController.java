package com.example.SpringBootDemo.restController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @Value("${coach.name}")
    private String name;

    @GetMapping("/hello")
    public String display(){
        return "Hello " +name;
    }
}
