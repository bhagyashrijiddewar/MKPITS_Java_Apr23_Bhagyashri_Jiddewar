package com.example.bankingapplicationin_pure_mvc;

import java.util.Date;

public class TransferMoneyEntity {
    private String user_id;
    private Date transaction_Date;
    private int amount;
    private String transaction_Type;

    public TransferMoneyEntity() {
    }



    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Date getTransaction_Date() {
        return transaction_Date;
    }

    public void setTransaction_Date(Date transaction_Date) {
        this.transaction_Date = transaction_Date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTransaction_Type() {
        return transaction_Type;
    }

    public void setTransaction_Type(String transaction_Type) {
        this.transaction_Type = transaction_Type;
    }
}
