package Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class Account_Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
       String user_id;
       String password;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
             user_id=request.getParameter("user");
             password=request.getParameter("password");
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
//                 out.println("Driver loaded");
                Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Anaisha160421");
//                out.println("Establish Connection");
                
                  PreparedStatement preparedStatement = connection.prepareStatement("select * from account_Details where userid=? and user_password=?");
                  preparedStatement.setString(1, user_id);
                  preparedStatement.setString(2, password);
                  ResultSet resultSet = preparedStatement.executeQuery();
                 
                 if(resultSet.next()){
//                    out.println("Login Successfully");
                    HttpSession httpSession= request.getSession(true);
                    httpSession.setAttribute("userid", user_id);
                    
                    
                     RequestDispatcher rd=request.getRequestDispatcher("MyPage.html");  
                     rd.forward(request,response);  

                 }else{
                     out.println("Incorrect username and password");
                     out.println("<a href='index.html'>Login Again");
                     out.println("</a>");
                 }
                  /* TODO output your page here. You may use following sample code. */

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
           try {
               processRequest(request, response);
           } catch (SQLException ex) {
               Logger.getLogger(Account_Login.class.getName()).log(Level.SEVERE, null, ex);
           }
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
           try {
               processRequest(request, response);
           } catch (SQLException ex) {
               Logger.getLogger(Account_Login.class.getName()).log(Level.SEVERE, null, ex);
           }
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
