<%@ page import="bankingServices.Services" %><%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 04-11-2023
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bank" class="com.example.bankingapplicationin_pure_mvc.BankAccountDetails" scope="application"/>
<jsp:setProperty name="bank" property="balance" param="amount"/>
<%
  HttpSession httpSession= request.getSession();
  String user_session=httpSession.getAttribute("user_id").toString();

  Services services=new Services();
 if(services.updateDeposit(bank)!=0){
   out.println("Deposit Update success.");
 }else {
   out.println("Failed to deposit.");
 }
%>

