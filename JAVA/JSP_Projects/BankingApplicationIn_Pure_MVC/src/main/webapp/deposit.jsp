<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 04-11-2023
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>deposit</title>
</head>
<body>
<form action="controller/deposit_JSP.jsp" method="post">
    <table>
        <tr>
            <td><label>Deposit Amount :</label></td>
            <td><input type="number" name="amount"></td>
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
