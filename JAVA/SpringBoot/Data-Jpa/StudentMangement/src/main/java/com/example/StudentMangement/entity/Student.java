package com.example.StudentMangement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    private int Roll_No;
    private String Name_;
    private String Address;
    private String City;

    public Student() {
    }
    public Student(int roll_No, String name_, String address, String city) {
        Roll_No = roll_No;
        Name_ = name_;
        Address = address;
        City = city;
    }

    public int getRoll_No() {
        return Roll_No;
    }

    public void setRoll_No(int roll_No) {
        Roll_No = roll_No;
    }

    public String getName_() {
        return Name_;
    }

    public void setName_(String name_) {
        Name_ = name_;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
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
