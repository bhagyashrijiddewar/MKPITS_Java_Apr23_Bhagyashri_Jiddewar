/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Dell
 */
public class AccountDetails {
    private String user_id;
    private String password;
    private String name;
    private String address;
    private String city;
    private int balance;

    public AccountDetails() {
    }

    public AccountDetails(String user_id, String password, String name, String address, String city, int balance) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.address = address;
        this.city = city;
        this.balance = balance;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
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
    
    
    
}
