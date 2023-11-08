package bankingServices;

import com.example.bankingapplicationin_pure_mvc.AdminLogin;
import com.example.bankingapplicationin_pure_mvc.BankAccountDetails;
import com.example.bankingapplicationin_pure_mvc.TotalLogs;
import com.example.bankingapplicationin_pure_mvc.TransferMoneyEntity;

import java.sql.*;

import static java.lang.System.out;

public class Services {
    Connection connection;
    ResultSet resultSet;
    int result = 0;

    public Services() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            out.println("Driver loaded");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Details", "root", "Anaisha160421");
            out.println("Connection establish");

        } catch (Exception e) {
            out.println(e);
        }
    }

    public int insertRecord(BankAccountDetails bankAccountDetails) {
        int result = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into account_Details " +
                    "(user_id,user_password,user_name,user_address,city,balance,Creation_On) values(?,?,?,?,?,?,?)");
            preparedStatement.setString(1, bankAccountDetails.getUserid());
            preparedStatement.setString(2, bankAccountDetails.getPassword());
            preparedStatement.setString(3, bankAccountDetails.getName());
            preparedStatement.setString(4, bankAccountDetails.getAddress());
            preparedStatement.setString(5, bankAccountDetails.getCity());
            preparedStatement.setInt(6, bankAccountDetails.getBalance());
            preparedStatement.setTimestamp(7, bankAccountDetails.getCreationOn());

            result = preparedStatement.executeUpdate();

        } catch (Exception e) {
            out.println(e);
        }
        return result;
    }

    public ResultSet loginRecord(BankAccountDetails bankAccountDetails) {
        ResultSet resultSet = null;
        try {
            out.println("Hi");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from account_Details where user_id=? and user_password=?");
            preparedStatement.setString(1, bankAccountDetails.getUserid());
            preparedStatement.setString(2, bankAccountDetails.getPassword());
            resultSet = preparedStatement.executeQuery();

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return resultSet;
    }

    public int updateDeposit(BankAccountDetails bankAccountDetails) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update account_Details set balance=balance+? where user_id=?");
            preparedStatement.setInt(1, bankAccountDetails.getBalance());
            preparedStatement.setString(2, bankAccountDetails.getUserid());
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            out.println(e);
        }
        return result;
    }

    public int updateWithdraw(BankAccountDetails bankAccountDetails) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update account_Details set balance=balance-? where user_id=?");
            preparedStatement.setInt(1, bankAccountDetails.getBalance());
            preparedStatement.setString(2, bankAccountDetails.getUserid());
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            out.println(e);
        }
        return result;

    }

    public int transferAmount(TransferMoneyEntity transferMoneyEntity) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into transactions values (?,?,?,?)");
            preparedStatement.setString(1, transferMoneyEntity.getUser_id());
            preparedStatement.setDate(2, (Date) transferMoneyEntity.getTransaction_Date());
            preparedStatement.setInt(3, transferMoneyEntity.getAmount());
            preparedStatement.setString(4, "out");
            result = preparedStatement.executeUpdate();

        } catch (Exception e) {
            out.println(e);
        }

        return result;
    }

    public int reduceTransferAmount(TransferMoneyEntity transferMoneyEntity) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update account_Details set Balance=Balance-? where user_id=?");
            preparedStatement.setInt(1, transferMoneyEntity.getAmount());
            preparedStatement.setString(2, transferMoneyEntity.getUser_id());
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            out.println(e);
        }
        return result;
    }

    public int receiveAmount(TransferMoneyEntity transferMoneyEntity, String uid) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into transactions values (?,?,?,?)");

            preparedStatement.setString(1, uid);
            preparedStatement.setDate(2, (Date) transferMoneyEntity.getTransaction_Date());
            preparedStatement.setInt(3, transferMoneyEntity.getAmount());
            preparedStatement.setString(4, "In");

            result = preparedStatement.executeUpdate();


        } catch (Exception e) {
            out.println(e);
        }
        return result;
    }

    public int addTransferAmount(TransferMoneyEntity transferMoneyEntity, String uid) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update account_Details set Balance=Balance+? where user_id=?");
            preparedStatement.setInt(1, transferMoneyEntity.getAmount());
            preparedStatement.setString(2, uid);
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            out.println(e);
        }
        return result;
    }

    public ResultSet transactionStatement(TransferMoneyEntity transferMoneyEntity) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select transaction_date,amount,Transaction_Type from transactions where user_id=?");
            preparedStatement.setString(1, transferMoneyEntity.getUser_id());
            resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {
            out.println(e);
        }
        return resultSet;
    }

    public int insertAdminLoginCredentials(AdminLogin adminLogin) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into admin_login value (?,?)");
            preparedStatement.setString(1, adminLogin.getAdminId());
            preparedStatement.setString(2, adminLogin.getPassword());
            result = preparedStatement.executeUpdate();

        } catch (Exception e) {
            out.println(e);
        }
        return result;
    }

    public ResultSet adminLogin(AdminLogin adminLogin) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from admin_Login where user_id=? and user_password=?");
            preparedStatement.setString(1, adminLogin.getAdminId());
            preparedStatement.setString(2, adminLogin.getPassword());
            resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {
            out.println(e);
        }
        return resultSet;
    }

    public ResultSet displayRecordsToAdmin(BankAccountDetails bankAccountDetails) {
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("select user_id,Creation_On,isApproved from account_Details where isApproved='false' ");
        } catch (Exception e) {
            out.println(e);
        }
        return resultSet;
    }

    public ResultSet displaySingleRecord(String user_id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from account_Details where user_id=?");
            preparedStatement.setString(1,user_id);
            resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {
            out.println(e);
        }
        return resultSet;
    }
    public int isApprovalByAdmin(BankAccountDetails bankAccountDetails,String userId){
        try{
            PreparedStatement preparedStatement=connection.prepareStatement("UPDATE account_Details SET isApproved = 'true'," +
                                                " ApprovedAt = ? , ApprovedBy = ? where user_id=?");
            preparedStatement.setString(3,userId);
            preparedStatement.setTimestamp(1,bankAccountDetails.getApprovedAt());
            preparedStatement.setString(2,bankAccountDetails.getApprovedBy().toString());
            result=preparedStatement.executeUpdate();

        }catch (Exception e){
            out.println(e);
        }
        return result;

    }

    public int logRecord(TotalLogs totalLogs){
        try{
           PreparedStatement preparedStatement= connection.prepareStatement("insert into log_details values(?,?,?)");
           preparedStatement.setTimestamp(1,totalLogs.getLogTime());
           preparedStatement.setString(2,totalLogs.getTaskDone());
           preparedStatement.setString(3,totalLogs.getUserId());
         result=  preparedStatement.executeUpdate();
        }catch(Exception e){
            out.println(e);
        }
        return  result;
    }



}



