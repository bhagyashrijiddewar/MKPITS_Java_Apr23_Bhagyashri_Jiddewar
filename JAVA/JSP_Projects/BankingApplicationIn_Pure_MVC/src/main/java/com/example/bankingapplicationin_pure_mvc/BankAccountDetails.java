package com.example.bankingapplicationin_pure_mvc;

import java.sql.Timestamp;

public class BankAccountDetails {
    private String userid;
    private String password;
    private String name;
    private String address;
    private String city;
    private int balance;
    private Timestamp creationOn;
    private Timestamp approvedAt;
    private String approvedBy;

    public BankAccountDetails() {
    }
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Timestamp getCreationOn() {
        return creationOn;
    }

    public void setCreationOn(Timestamp creationOn) {
        this.creationOn = creationOn;
    }

    public Timestamp getApprovedAt() {
        return approvedAt;
    }

    public void setApprovedAt(Timestamp approvedAt) {
        this.approvedAt = approvedAt;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }
}
