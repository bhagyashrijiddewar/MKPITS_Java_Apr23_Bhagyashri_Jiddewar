package com.example.Account.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ControllerSaving {

    private Account account;
    //----------Constructor injection--------
    @Autowired
    public ControllerSaving(@Qualifier("savingAccount") Account account) {
        this.account = account;
    }

   //-----------Setter injection-------------------
//    @Autowired
//    public void setAccount(Account account) {
//        this.account = account;
//    }

    @GetMapping("/message")
    public String display(){
    return account.displayMessage();
    }
}
