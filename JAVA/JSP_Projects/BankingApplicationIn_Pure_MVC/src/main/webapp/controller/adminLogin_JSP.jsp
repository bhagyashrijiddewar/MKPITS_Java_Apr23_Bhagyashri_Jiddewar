
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="bankingServices.Services" %>
<jsp:useBean id="admin" class="com.example.bankingapplicationin_pure_mvc.AdminLogin" scope="application"/>

<%
    Services services=new Services();
   ResultSet resultSet= services.adminLogin(admin);
   if(resultSet.next()){
       out.println("Login Succesfully");
   }else {
       out.println("Failed to login");
   }
%>