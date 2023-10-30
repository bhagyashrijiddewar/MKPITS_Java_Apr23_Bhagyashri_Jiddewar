/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class Account_registration extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Connection connection;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String user_id= request.getParameter("user");
           String user_password= request.getParameter("password");
           String user_name= request.getParameter("name");
           String user_Address= request.getParameter("address");
           String user_City= request.getParameter("city");
           int user_Balance= Integer.parseInt(request.getParameter("balance"));
           
           Class.forName("com.mysql.cj.jdbc.Driver");
//                 out.println("Driver loaded");
                Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Anaisha160421");
//                out.println("Establish Connection");
                
                PreparedStatement preparedStatement = connection.prepareStatement("insert into account_Details values(?,?,?,?,?,?)");
            preparedStatement.setString(1, user_id);
            preparedStatement.setString(2,user_password);
            preparedStatement.setString(3,user_name);
            preparedStatement.setString(4,user_Address);
            preparedStatement.setString(5,user_City);
            preparedStatement.setInt(6, user_Balance);

             int returnValue = preparedStatement.executeUpdate();
            if(returnValue!=0){
                out.println("Record inserted");
            }else{
                out.println("unable to insert record");
            }
                      
        } catch (Exception ex) {
            out.println(ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
            processRequest(request, response);
      
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            processRequest(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
