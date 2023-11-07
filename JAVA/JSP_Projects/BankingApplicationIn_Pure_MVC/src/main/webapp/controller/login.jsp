<%@ page import="bankingServices.Services" %>
<%@ page import="java.sql.ResultSet" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<jsp:useBean id="bank" class="com.example.bankingapplicationin_pure_mvc.BankAccountDetails" scope="application"/>

<jsp:setProperty name="bank" property="userid" param="userid"/>
<jsp:setProperty name="bank" property="password" param="password"/>
<%
    Services services = new Services();
    ResultSet resultSet = services.loginRecord(bank);
    try {
        if(resultSet.next()){
            out.println("Login successfully");

           RequestDispatcher requestDispatcher= request.getRequestDispatcher("../homePage.jsp");
           requestDispatcher.forward(request,response);

            HttpSession httpSession= request.getSession();
            session.setAttribute("user_id",bank.getUserid());
        }else{
            out.println("Failed to login");
        }
    } catch (Exception e) {
       out.println(e);
    }
%>
