package com.example.NewSpringBootApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    private int Roll_No;
    private  String Name_;
    private String Address;
    private String City;

    public Student() {
    }
    public Student(String name_, String address, String city) {
        Name_ = name_;
        Address = address;
        City = city;
    }

    public void setRoll_No(int roll_No) {
        Roll_No = roll_No;
    }

    public void setName_(String name_) {
        Name_ = name_;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Roll_No=" + Roll_No +
                ", Name_='" + Name_ + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}
