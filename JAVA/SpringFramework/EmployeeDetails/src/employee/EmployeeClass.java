/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Dell
 */
public class EmployeeClass {
    private int id;
    private String name;
   private Address address;

    public EmployeeClass() {
    }

    public EmployeeClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    

    public void display() {
        System.out.println("id = "+id +"\n"+ "Name = "+name+"\n"+"Address = "+address);
    }
}
