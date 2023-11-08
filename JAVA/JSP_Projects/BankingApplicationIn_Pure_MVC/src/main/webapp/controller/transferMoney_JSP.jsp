
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="bankingServices.Services" %>

<jsp:useBean id="transfer" class="com.example.bankingapplicationin_pure_mvc.TransferMoneyEntity" scope="application"/>
<jsp:useBean id="bank" class="com.example.bankingapplicationin_pure_mvc.BankAccountDetails" scope="application"/>
<jsp:useBean id="log" class="com.example.bankingapplicationin_pure_mvc.TotalLogs" scope="application"/>

<jsp:setProperty name="bank" property="userid" param="accountNumber"/>
<jsp:setProperty name="bank" property="creationOn" value='<%= new java.sql.Timestamp(session.getCreationTime())%>'/>

<jsp:setProperty name="transfer" property="amount" param="amountEnter"/>
<jsp:setProperty name="transfer" property="user_id" value='<%= session.getAttribute("user_id")%>'/>

<%
    session.setAttribute("userId",transfer.getUser_id());
    session.setAttribute("logDate",new java.sql.Timestamp(session.getLastAccessedTime()));
%>
<jsp:setProperty name="log" property="logTime" value='<%= session.getAttribute("logDate")%>'/>
<jsp:setProperty name="log" property="taskDone" value="Transfer out"/>
<jsp:setProperty name="log" property="userId" value='<%= session.getAttribute("userId")%>'/>
<%
    Services services=new Services();
   if(services.transferAmount(transfer)!=0){
       if(services.reduceTransferAmount(transfer)!=0) {
           out.println("Successfully transfer amount");
           services.logRecord(log);
           if (services.receiveAmount(transfer, bank.getUserid()) != 0)
               if (services.addTransferAmount(transfer,bank.getUserid()) != 0)
                   out.println("Successfully received amount");
       }
   }else {
       out.println("Failed to transfer amount");
   }
%>

