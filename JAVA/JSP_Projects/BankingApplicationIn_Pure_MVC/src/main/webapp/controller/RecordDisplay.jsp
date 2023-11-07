<%@ page import="bankingServices.Services" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bank" class="com.example.bankingapplicationin_pure_mvc.BankAccountDetails" scope="application"/>
<% String userId=request.getParameter("id");

   Services services=new Services();
   ResultSet resultSet=services.displaySingleRecord(userId);
%>
<html>
<head>
    <title>AdminStatement</title>
</head>
<body>
<table border cellspacing=0 cellpadding=10 align=center>
<%
   while (resultSet.next()){
%>
    <tr>
        <th>User id</th>
        <td><%= resultSet.getString(1)%></td>
    </tr>
    <tr>
        <th>Password</th>
        <td><%= resultSet.getString(2)%></td>
    </tr>
    <tr>
        <th>Name</th>
        <td><%= resultSet.getString(3)%></td>
    </tr>
    <tr>
        <th>Address</th>
        <td><%= resultSet.getString(4)%></td>
    </tr>
    <tr>
        <th>City</th>
        <td><%= resultSet.getString(5)%></td>
    </tr>
    <tr>
        <th>Balance</th>
        <td><%= resultSet.getInt(6)%></td>
    </tr>
    <tr>
        <th>Creation On</th>
        <td><%= resultSet.getTimestamp(7)%></td>
    </tr>
    <tr>
        <th>Approved At</th>
        <td><%= resultSet.getTimestamp(8)%></td>
    </tr>
    <tr>
        <th>Approved By</th>
        <td><%= resultSet.getString(9)%></td>
    </tr>
    <tr>
        <th>isApproved</th>
        <td><%= resultSet.getString(10)%></td>
    </tr>
    <tr>
        <td>
            <button>
                <a href="Approval_JSP.jsp?userId=<%= userId%>">Accept</a>
            </button>
        </td>
        <td>
            <button>
                <a href="admin_JSP.jsp">Reject</a>
            </button>
        </td>
    </tr>
    <%
   }
%>
</table>
</body>
</html>
