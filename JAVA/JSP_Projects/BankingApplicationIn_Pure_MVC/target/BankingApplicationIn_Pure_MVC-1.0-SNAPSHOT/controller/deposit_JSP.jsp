<%@ page import="bankingServices.Services" %>
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

