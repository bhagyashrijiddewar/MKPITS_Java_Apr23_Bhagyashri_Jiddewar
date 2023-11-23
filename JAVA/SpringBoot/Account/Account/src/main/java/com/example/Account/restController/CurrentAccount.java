package com.example.Account.restController;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary

public class CurrentAccount implements Account{
    public CurrentAccount() {
        System.out.println("Constructor Current Account.");
    }
    @Override
    public String displayMessage() {
        return "This is current account." ;
    }
}
