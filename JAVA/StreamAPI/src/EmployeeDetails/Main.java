package EmployeeDetails;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        ArrayList<Employee> employeeList=new ArrayList<Employee>();
        Employee[] employees=new Employee[3];
        employees[0]=new Employee("Pranay",10000);
        employees[1]=new Employee("Abhi",20000);
        employees[2]=new Employee("Shubham",15000);
        employeeList.addAll(Arrays.asList(employees));
        System.out.println(employeeList);

//       ArrayList list= (ArrayList) employeeList.stream().map(employeeDtails ->employeeDtails).collect(Collectors.toList());
        
        ArrayList <Employee>list= (ArrayList<Employee>) employeeList.stream().map(c->c).collect(Collectors.toList());
        System.out.println("Employee Detailed List : "+list);

        employeeList.stream().map(employee -> employee).forEach(System.out::println);
       ArrayList <Employee> arrayList= (ArrayList<Employee>) employeeList.stream().filter(e->e.getSalary()>11000).collect(Collectors.toList());
        System.out.println("Whose salary is greater than 11000 : "+arrayList);
    }
}
