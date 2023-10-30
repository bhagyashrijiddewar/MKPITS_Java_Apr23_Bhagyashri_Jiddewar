/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.String;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dell
 */
public class Deposit_Amount extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
           int amount= Integer.parseInt(request.getParameter("amount"));
           
                HttpSession httpSession=request.getSession(true);
                
           String userId=httpSession.getAttribute("userid").toString();
                
//           String userId=request.getParameter("SBI111");
           
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
//                out.println("Driver loaded");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Anaisha160421");
//                out.println("Establish Connection");
                
                PreparedStatement preparedStatement = connection.prepareStatement("insert into transactions values (?,?,?,?) ");
                preparedStatement.setString(4, "Deposit");
                preparedStatement.setInt(3, amount);
                preparedStatement.setDate(2, Date.valueOf(java.time.LocalDate.now()));
                preparedStatement.setString(1,userId);
                int result=preparedStatement.executeUpdate();
                if(result!=0){
                    out.println("Deposit Successfully");
                }else{
                    out.println("Unsuccessfully deposit.");
                }
                PreparedStatement preparedStatementUpdate = connection.prepareStatement("update account_Details set Balance=Balance+? where userid=? ");
                preparedStatementUpdate.setInt(1, amount);
                preparedStatementUpdate.setString(2,userId);
                 
                int updateResult=preparedStatementUpdate.executeUpdate();
                if(updateResult!=0){
                    out.println("Successfully Update");
                }else{
                    out.println("Unsuccessfully update.");
                }
                
                

                
            } catch (Exception ex) {
                out.println(ex);
            }
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
