package com.example.StudentMangement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class Student {

    private int rollNo;
    @Size(min = 1,message = "is required")
    @NotNull(message="This field is required.")
    private String name="";
    private String address;
    private String city;
    private String subject;
    private String gender;

    public Student() {
    }

    public Student(int rollNo, String name, String address, String city, String subject, String gender) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.city = city;
        this.subject = subject;
        this.gender = gender;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", subject='" + subject + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
