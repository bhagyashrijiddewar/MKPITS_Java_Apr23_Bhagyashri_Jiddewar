<%@ page import="bankingServices.Services" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="transfer" class="com.example.bankingapplicationin_pure_mvc.TransferMoneyEntity" scope="application"/>
<jsp:setProperty name="transfer" property="user_id" value='<%= session.getAttribute("user_id")%>'/>

<%
    Services services=new Services();
   ResultSet resultSet= services.transactionStatement(transfer);
%>
<html>
<head>
    <title>Statement</title>
</head>
<body>
<table border cellspacing=0 cellpadding=10 align=center>
    <tr>
        <th>Transaction Date</th>
        <th>Amount</th>
        <th>Transaction Type</th>
    </tr>
    <%
        while (resultSet.next())
        {
    %>
    <tr>
        <td>
            <%= resultSet.getDate(1) %>
        </td>
        <td>
            <%= resultSet.getInt(2) %>
        </td>
        <td>
            <%= resultSet.getString(3) %>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>


