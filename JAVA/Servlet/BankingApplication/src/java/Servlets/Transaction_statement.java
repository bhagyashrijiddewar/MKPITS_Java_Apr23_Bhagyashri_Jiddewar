/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class Transaction_statement extends HttpServlet {

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
            HttpSession httpSession=request.getSession(true);
                
           String userId=httpSession.getAttribute("userid").toString();
//           int balance=Integer.parseInt(httpSession.getAttribute("Balance").toString());
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
//                out.println("Driver loaded");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Anaisha160421");
//                out.println("Establish Connection");
                
                 PreparedStatement preparedStatementUpdate = connection.prepareStatement("select * from transactions where user_id=? ");
                 preparedStatementUpdate.setString(1,userId);
                ResultSet resultSet= preparedStatementUpdate.executeQuery();
                
                   out.println("<!DOCTYPE html>");
                   out.println("<html>");
                   out.println("<head>");
                   out.println("<title>Servlet DisplayStudentInfo</title>");            
                   out.println("</head>");
                   out.println("<body>");
                   out.println("<center><h1>Student Details</h1></center>");
                   out.println("<table border cellspacing=0 cellpadding=10 align=center>"
                    + "<tr>"
                    + "<th>User_id</th>"
                    +"<th>Transaction_Date</th>"
                    +"<th>Amount</th>"
                    +"<th>Transaction_Type</th>"
                    +"</tr>");
            while (resultSet.next()){ 
                
                    out.println("<tr>"
                    +"<td>"+resultSet.getString(1)+"</td>"
                    +"<td>"+resultSet.getDate(2)+"</td>"
                    +"<td>"+resultSet.getInt(3)+"</td>"
                    +"<td>"+resultSet.getString(4)+"</td>"
                    + "</tr>");
            }
             out.println("</table>");
             
             PreparedStatement preparedStatement = connection.prepareStatement("select Balance from account_Details where userid=? ");
             preparedStatement.setString(1,userId);
             ResultSet resultSet1= preparedStatement.executeQuery();
             if(resultSet1.next()){
             out.println("<table border cellspacing=0 cellpadding=10 align=center>"
                     +"<tr>"
                     + "<th colspan=3>Balance = </th>"
                     +"<th>"+resultSet1.getInt(1)+"</th>"
                     +"</tr>"
                     +"</table>");
             }
             out.println("</body>");
             out.println("</html>");
            
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
