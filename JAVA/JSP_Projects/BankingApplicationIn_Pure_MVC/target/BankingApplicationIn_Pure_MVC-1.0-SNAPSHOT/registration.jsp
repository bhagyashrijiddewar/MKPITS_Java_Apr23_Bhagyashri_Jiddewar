<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 03-11-2023
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registration</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <style>
        body{
            margin-top: 20px;
            background-color: lightblue;
        }
        table{
            box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px;
        }
    </style>
</head>
<body>
<form action="controller/registerJsp.jsp" method="post">
    <table class="container d-flex justify-content-center border borderless p-5 col-lg-4 table table-warning">
    <tr>
        <td>
            <h1  class="font-weight-bold d-flex justify-content-center">Registration</h1>
        </td>
    </tr>
    <tr>
        <td>
            <label>UserID</label>
        </td>
        <td>
            <input type="text" class="form-control" name="userid">
        </td>
    </tr>
    <tr>
        <td>
            <label>Password</label>
        </td>
        <td>
            <input type="password" class="form-control" name="password">
        </td>
    </tr>
    <tr>
        <td>
            <label>Name</label>
        </td>
        <td>
            <input type="text" class="form-control" name="name">
        </td>
    </tr>
    <tr>
        <td>
            <label>Address</label>
        </td>
        <td>
            <input type="test" class="form-control" name="address">
        </td>
    </tr>
    <tr>
        <td>
            <label>City</label>
        </td>
        <td>
            <input type="text" class="form-control" name="city">
        </td>
    </tr>
    <tr>
        <td>
            <label>Balance</label>
        </td>
        <td>
            <input type="number" class="form-control" name="balance">
        </td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <input type="submit"  class=" btn btn-success w-50 " value="Register">
        </td>
    </tr>
    <tr>
        <td class="text-center" colspan="2">
            <label>Already register:</label>
            <a  href="index.jsp">Click Here</a>
        </td>
    </tr>
</table>

</form>
</body>
</html>
