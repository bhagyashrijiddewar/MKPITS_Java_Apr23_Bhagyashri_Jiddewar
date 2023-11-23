package com.example.Account.restController;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class SavingAccount implements Account {
    public SavingAccount() {
        System.out.println("constructor saving account.");
    }

    @Override
    public String displayMessage() {
        return "This is my first springBoot project.";
    }
}
