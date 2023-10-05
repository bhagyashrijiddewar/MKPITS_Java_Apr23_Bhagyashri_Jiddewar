package StudentData;

import java.sql.*;

public class JavaConnectivity {
    static Connection connection;
    public static void dbcorn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Anaisha160421");
            System.out.println("Connection established");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void displayData(){
        try {
            dbcorn();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from actor");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+
                        " "+resultSet.getDate(4));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void insertData(int actor_id,String first_name,String last_name,String last_update){
        try {
            dbcorn();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into actor values(?,?,?,?)");
            preparedStatement.setInt(1,actor_id);
            preparedStatement.setString(2,first_name);
            preparedStatement.setString(3,last_name);
            preparedStatement.setString(4,last_update);

            int returnValue = preparedStatement.executeUpdate();
            if(returnValue!=0){
                System.out.println("Record inserted");
            }else{
                System.out.println("unable to insert record");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateData(int actor_id,String first_name){
        try {
            dbcorn();
            PreparedStatement preparedStatement = connection.prepareStatement("update actor set first_name=? where actor_id=?");
            preparedStatement.setString(1,first_name);
            preparedStatement.setInt(2,actor_id);
            preparedStatement.executeUpdate();

            System.out.println(" update record");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteData(int actor_id){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from actor where actor_id=?");
            preparedStatement.setInt(1,actor_id);
            int returnValue = preparedStatement.executeUpdate();
            if(returnValue!=0)
                System.out.println("record deleted");
            else
                System.out.println("unable to delete record");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
