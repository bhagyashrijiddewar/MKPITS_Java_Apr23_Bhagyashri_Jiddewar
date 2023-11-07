
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="bankingServices.Services" %>

<jsp:useBean id="transfer" class="com.example.bankingapplicationin_pure_mvc.TransferMoneyEntity" scope="application"/>
<jsp:useBean id="bank" class="com.example.bankingapplicationin_pure_mvc.BankAccountDetails" scope="application"/>

<jsp:setProperty name="bank" property="userid" param="accountNumber"/>
<jsp:setProperty name="transfer" property="amount" param="amountEnter"/>
<%--<jsp:setProperty name="transfer" property="transaction_Type" --%>
<jsp:setProperty name="transfer" property="user_id" value='<%= session.getAttribute("user_id")%>'/>
<jsp:setProperty name="transfer" property="transaction_Date" value="<%= new java.sql.Date(session.getCreationTime())%>"/>

<%
    Services services=new Services();
   if(services.transferAmount(transfer)!=0){
       if(services.reduceTransferAmount(transfer)!=0) {
           out.println("Successfully transfer amount");
           if (services.receiveAmount(transfer, bank.getUserid()) != 0)
               if (services.addTransferAmount(transfer,bank.getUserid()) != 0)
                   out.println("Successfully received amount");
       }
   }else {
       out.println("Failed to transfer amount");
   }
%>

