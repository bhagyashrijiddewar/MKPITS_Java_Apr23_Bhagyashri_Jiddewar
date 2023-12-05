package com.example.StudentMangement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Student {
    @Id
    @Column(name="Roll_No")
    private int rollNo;
    @Column(name="Name_")
    private String name;
    @Column(name="Address")
    private String address;
    @Column(name="City")
    private String city;

    public Student() {
    }
    public Student(int rollNo, String name, String address, String city) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.city = city;
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
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
