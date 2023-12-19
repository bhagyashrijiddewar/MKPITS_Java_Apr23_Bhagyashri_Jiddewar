package com.example.StudentMangement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "Address_details")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int address_Id;
    private String address;
    private String city;
    @JsonBackReference
    @OneToOne(mappedBy = "address",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "address_Id")
    private Student student;

    public Address() {
    }

    public Address(String address, String city, Student student) {
        this.address = address;
        this.city = city;
        this.student = student;
    }

    public Address(String address, String city) {
        this.address = address;
        this.city = city;
    }

    public int getAddress_Id() {
        return address_Id;
    }

    public void setAddress_Id(int address_Id) {
        this.address_Id = address_Id;
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
