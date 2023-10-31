/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import bank.AccountDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class BankingServices {

    Connection connection;
    int result;
    int result1;
    ResultSet resultSet;

    public BankingServices() {
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Anaisha160421");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public int insertRecord(AccountDetails accountDetails) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into account_details values(?,?,?,?,?,?)");
            preparedStatement.setString(1,accountDetails.getUser_id());
            preparedStatement.setString(2,accountDetails.getPassword());
            preparedStatement.setString(3,accountDetails.getName());
            preparedStatement.setString(4,accountDetails.getAddress());
            preparedStatement.setString(5,accountDetails.getCity());
            preparedStatement.setInt(6,accountDetails.getBalance());
            
            result=preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return result;
    }
    
    public ResultSet loginRecord(AccountDetails accountDetails){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select* from account_details where userid=? and user_password=?");
            preparedStatement.setString(1,accountDetails.getUser_id());
            preparedStatement.setString(2,accountDetails.getPassword());
             resultSet=  preparedStatement.executeQuery();
           
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return resultSet;

        
    }
     public int depositAmount(AccountDetails accountDetails){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update account_details set Balance=Balance+? where userid=?");
            preparedStatement.setString(1,accountDetails.getUser_id());
            preparedStatement.setInt(2,accountDetails.getBalance());
             result1=  preparedStatement.executeUpdate();
           
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result1;

        
    }
}
