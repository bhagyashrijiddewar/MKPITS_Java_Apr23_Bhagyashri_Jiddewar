/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import stud.StudentInformation;

/**
 *
 * @author Dell
 */
public class StudentService {
    
    Connection connection;
    PreparedStatement preparStatement;
    int resultInsert=0;

    public StudentService() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details","root","Anaisha160421");
        } catch (Exception ex) {
           System.out.println(ex);
        }    
    }
    
    public int insertRecord(StudentInformation studentInformation){
        
        try {
             preparStatement= connection.prepareStatement("insert into student_info values(?,?,?,?)");
             preparStatement.setString(1,studentInformation.getRollNo());
             preparStatement.setString(2,studentInformation.getName());
             preparStatement.setString(3,studentInformation.getAddress());
             preparStatement.setString(4,studentInformation.getCity());
             
            resultInsert= preparStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return resultInsert;
    }
  
}
