<%@ page import="bankingServices.Services" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bank" class="com.example.bankingapplicationin_pure_mvc.BankAccountDetails" scope="application"/>
<jsp:useBean id="admin" class="com.example.bankingapplicationin_pure_mvc.AdminLogin" scope="application"/>

<%
    Services services=new Services();

    ResultSet resultSet1=services.adminLogin(admin);
   while (resultSet1.next()){
     ResultSet resultSet=services.displayRecordsToAdmin(bank);
%>
<html>
<head>
    <title>AdminStatement</title>
</head>
<body>
<table border cellspacing=0 cellpadding=10 align=center>
    <tr>
        <th>User ID</th>
        <th>Creation Time</th>
        <th>isApproved</th>
    </tr>
    <%
        while (resultSet.next())
        {
    %>
    <tr>
        <td>
            <a href="RecordDisplay.jsp?id=<%=resultSet.getString(1)%>">
                <%= resultSet.getString(1) %>
            </a>
        </td>
        <td>
            <%= resultSet.getTimestamp(2) %>
        </td>
        <td>
            <%= resultSet.getString(3) %>
        </td>
    </tr>
    <%
        }
    %>
    <input type="submit" value=""></input>
</table>
</body>
</html>
<%
    }
%>