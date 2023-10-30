/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionTracking;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dell
 */
public class ServletMethod extends HttpServlet {

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
            HttpSession httpSession= request.getSession();
         out.println("Session id : "+httpSession.getId()+"<br>");
         out.println("Is Session new : "+httpSession.isNew()+"<br>");
         out.println("Get Class : "+httpSession.getClass()+"<br>");
         out.println("Get Session context : "+httpSession.getSessionContext()+"<br>");
         httpSession.setAttribute("1", "Bhagya");
         out.println("<br>");
         httpSession.putValue("2", "niks");
         out.println("Get attribute name=1 & value=: "+httpSession.getAttribute("1")+"<br>");
         out.println("Get value name=2 & value=: "+httpSession.getAttribute("1")+"<br>");
         out.println("Current Date "+new java.sql.Date(httpSession.getCreationTime())+"<br>");
         out.println("Get attribute names : "+httpSession.getAttributeNames());
         out.println("Get last assess time : "+httpSession.getLastAccessedTime());
         
         java.util.Enumeration<java.lang.String> a=httpSession.getAttributeNames();
         out.println("Get enumeration : "+a.nextElement());
         
         

            
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
