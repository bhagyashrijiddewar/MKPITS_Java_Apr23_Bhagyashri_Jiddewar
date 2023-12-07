package com.example.StudentMangement.entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student {
    @Size(min = 1,message = "is required")
    @NotNull(message =" is Required" )
    private String name="";

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
