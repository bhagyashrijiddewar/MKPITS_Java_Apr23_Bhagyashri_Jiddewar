<%@ page import="bankingServices.Services" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bank" class="com.example.bankingapplicationin_pure_mvc.BankAccountDetails" scope="application"/>
<jsp:useBean id="log" class="com.example.bankingapplicationin_pure_mvc.TotalLogs" scope="application"/>

<jsp:setProperty name="bank" property="balance" param="amount"/>
<jsp:setProperty name="bank" property="creationOn" value='<%= new java.sql.Timestamp(session.getCreationTime())%>'/>

<%
    session.setAttribute("logDate",bank.getCreationOn());
%>
<jsp:setProperty name="log" property="logTime" value='<%= session.getAttribute("logDate")%>'/>
<jsp:setProperty name="log" property="taskDone" value="Withdraw"/>
<%
    HttpSession httpSession= request.getSession();
    String user_session=httpSession.getAttribute("user_id").toString();
%>
<jsp:setProperty name="log" property="userId" value='<%= user_session %>'/>

<%
    Services services=new Services();
    if(services.updateWithdraw(bank)!=0){
        out.println("Withdraw Update success.");
        services.logRecord(log);
    }else {
        out.println("Failed to withdraw.");
    }
%>
