<%@ page import="bankingServices.Services" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bank" class="com.example.bankingapplicationin_pure_mvc.BankAccountDetails" scope="application"/>

<jsp:setProperty name="bank" property="userid" param="userid"/>
<jsp:setProperty name="bank" property="password" param="password"/>
<jsp:setProperty name="bank" property="name" param="name"/>
<jsp:setProperty name="bank" property="address" param="address"/>
<jsp:setProperty name="bank" property="city" param="city"/>
<jsp:setProperty name="bank" property="balance" param="balance"/>

<%--<jsp:getProperty name="bank" property="userid"/>--%>
<%--<jsp:getProperty name="bank" property="password"/>--%>
<%--<jsp:getProperty name="bank" property="name"/>--%>
<%--<jsp:getProperty name="bank" property="address"/>--%>
<%--<jsp:getProperty name="bank" property="city"/>--%>
<%--<jsp:getProperty name="bank" property="balance"/>--%>

<%
    Services services=new Services();
   if(services.insertRecord(bank)!=0){
       out.println("Record inserted successfully");
   }else{
       out.println("Failed to insert record. ");
   }
 %>



