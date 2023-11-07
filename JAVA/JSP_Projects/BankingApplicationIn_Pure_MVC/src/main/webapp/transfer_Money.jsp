<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 06-11-2023
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>transfer</title>
</head>
<body>

<form action="controller/transferMoney_JSP.jsp" method="post">
    <table>

        <tr>
            <td><label> Account Number :</label></td>
            <td><input type="text" name="accountNumber"></td>
        </tr>
        <tr>
            <td><label> Amount :</label></td>
            <td><input type="number" name="amountEnter"></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Submit">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
