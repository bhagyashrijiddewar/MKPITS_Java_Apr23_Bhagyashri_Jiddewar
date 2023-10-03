import java.sql.*;
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded...");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Anaisha160421");
           Statement statement= con.createStatement();
         ResultSet resultSet=statement.executeQuery("Select* from actor");
         while (resultSet.next()){
             System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+
                     " "+resultSet.getDate(4));
         }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}