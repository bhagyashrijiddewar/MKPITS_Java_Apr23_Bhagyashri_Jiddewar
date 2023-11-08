<%@ page import="bankingServices.Services" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bank" class="com.example.bankingapplicationin_pure_mvc.BankAccountDetails" scope="application"/>
<jsp:useBean id="log" class="com.example.bankingapplicationin_pure_mvc.TotalLogs" scope="application"/>

<jsp:setProperty name="bank" property="userid" param="userid"/>
<jsp:setProperty name="bank" property="password" param="password"/>
<jsp:setProperty name="bank" property="name" param="name"/>
<jsp:setProperty name="bank" property="address" param="address"/>
<jsp:setProperty name="bank" property="city" param="city"/>
<jsp:setProperty name="bank" property="balance" param="balance"/>
<jsp:setProperty name="bank" property="creationOn" value='<%= new java.sql.Timestamp(session.getCreationTime())%>'/>

<%
    session.setAttribute("logDate",bank.getCreationOn());
    session.setAttribute("userId",bank.getUserid());
    %>
<jsp:setProperty name="log" property="logTime" value='<%= session.getAttribute("logDate")%>'/>
<jsp:setProperty name="log" property="userId" value='<%= session.getAttribute("userId")%>'/>
<jsp:setProperty name="log" property="taskDone" value="Registration"/>

<%
    Services services=new Services();
   if(services.insertRecord(bank)!=0){
       out.println("Record inserted successfully");
       services.logRecord(log);

   }else{
       out.println("Failed to insert record. ");
   }
 %>



