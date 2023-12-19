package com.example.StudentMangement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Student_info")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Roll_No;
    private String Name_;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Student() {
    }

    public Student( String name_, Address address) {

        Name_ = name_;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
