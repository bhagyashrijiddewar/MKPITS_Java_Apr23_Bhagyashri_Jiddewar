/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dell
 */
public class Transfer_Money extends HttpServlet {

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
             request.getRequestDispatcher("MyPage.html").include(request, response);  

             int amount= Integer.parseInt(request.getParameter("amount"));
           
             HttpSession httpSession=request.getSession(true);
             String userId=httpSession.getAttribute("userid").toString();
             
            String accountNumber= request.getParameter("account_number");
             
             Date date=new java.sql.Date(httpSession.getCreationTime());
             
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                out.println("Driver loaded");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Anaisha160421");
                out.println("Establish Connection");
                
         PreparedStatement preparedStatement=connection.prepareStatement("insert into transactions values (?,?,?,?)");
         preparedStatement.setString(1,userId );
         preparedStatement.setDate(2,date );
         preparedStatement.setInt(3,amount );
         preparedStatement.setString(4,"Out");
         
         int result=preparedStatement.executeUpdate();
         if(result!=0){
             out.println("Money transfer successfully.");
         }else{
             out.println("Failed to transfer money.");
         }
         
           PreparedStatement preparedStatementUpdate = connection.prepareStatement("update account_Details set Balance=Balance-? where userid=? ");
                preparedStatementUpdate.setInt(1, amount);
                preparedStatementUpdate.setString(2,userId);
                 
                int updateResult=preparedStatementUpdate.executeUpdate();
                if(updateResult!=0){
//                    out.println("Successfully Update");
                    out.println("<a href='MyPage.html'>Back");
                }else{
                    out.println("Unsuccessfully update.");
                }
                
          PreparedStatement preparedStatementIn = connection.prepareStatement("insert into transactions values (?,?,?,?) ");
                preparedStatementIn.setString(4, "In");
                preparedStatementIn.setInt(3, amount);
                preparedStatementIn.setDate(2,date);
                preparedStatementIn.setString(1,accountNumber);
                int resultIn=preparedStatementIn.executeUpdate();
                if(resultIn!=0){
                    out.println("Credited Amount successfully");
                }else{
                    out.println("Failed to credit amount.");
                }
                
           PreparedStatement preparedStatementUpdateIn = connection.prepareStatement("update account_Details set Balance=Balance+? where userid=? ");
                preparedStatementUpdateIn.setInt(1, amount);
                preparedStatementUpdateIn.setString(2,accountNumber);
                 
                int updateResultIn=preparedStatementUpdateIn.executeUpdate();
                if(updateResultIn!=0){
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
