package bankingServices;

import com.example.bankingapplicationin_pure_mvc.BankAccountDetails;

import java.sql.*;

import static java.lang.System.out;

public class Services {
    Connection connection;
    int result=0;
    public Services() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            out.println("Driver loaded");
           connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Details", "root", "Anaisha160421");
            out.println("Connection establish");

        } catch (Exception e) {
            out.println(e);
        }
    }
    public int insertRecord(BankAccountDetails bankAccountDetails) {
        int result=0;
        try {
           PreparedStatement preparedStatement= connection.prepareStatement("insert into account_Details " +
                           "(user_id,user_password,user_name,user_address,city,balance) values(?,?,?,?,?,?)");
            preparedStatement.setString(1,bankAccountDetails.getUserid());
            preparedStatement.setString(2,bankAccountDetails.getPassword());
            preparedStatement.setString(3,bankAccountDetails.getName());
            preparedStatement.setString(4,bankAccountDetails.getAddress());
            preparedStatement.setString(5,bankAccountDetails.getCity());
            preparedStatement.setInt(6,bankAccountDetails.getBalance());

            result= preparedStatement.executeUpdate();

        } catch (Exception e) {
           out.println(e);
        }
        return result;
    }
    public ResultSet loginRecord(BankAccountDetails bankAccountDetails){
        ResultSet resultSet=null;
        try {
            out.println("Hi");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from account_Details where user_id=? and user_password=?");
            preparedStatement.setString(1,bankAccountDetails.getUserid());
            preparedStatement.setString(2,bankAccountDetails.getPassword());
            resultSet=  preparedStatement.executeQuery();

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return resultSet;
    }
    public int updateDeposit(BankAccountDetails bankAccountDetails){

        try {
            PreparedStatement preparedStatement=  connection.prepareStatement("update account_Details set balance=balance+? where user_id=?");
           preparedStatement.setInt(1,bankAccountDetails.getBalance());
           preparedStatement.setString(2,bankAccountDetails.getUserid());
            result= preparedStatement.executeUpdate();
        } catch (Exception e) {
            out.println(e);
        }
        return result;

    }
    public int updateWithdraw(BankAccountDetails bankAccountDetails){

        try {
            PreparedStatement preparedStatement=  connection.prepareStatement("update account_Details set balance=balance-? where user_id=?");
            preparedStatement.setInt(1,bankAccountDetails.getBalance());
            preparedStatement.setString(2,bankAccountDetails.getUserid());
            result= preparedStatement.executeUpdate();
        } catch (Exception e) {
            out.println(e);
        }
        return result;

    }

}

