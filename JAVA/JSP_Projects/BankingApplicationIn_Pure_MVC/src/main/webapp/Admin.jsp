
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>login</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <style>
        body{
            margin-top: 100px;
            background-color: lightblue;
        }
        table{
            box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px;
        }
    </style>
</head>
<body>
<form action="controller/admin_JSP.jsp" method="post">
    <table class="container d-flex justify-content-center border borderless p-5 col-lg-4 table table-warning">
        <tr>
            <td align="center">
                <h1>Admin Login</h1>
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
            <td colspan="2" align="center">
                <input type="submit"  class=" btn btn-success w-50 " value="Login">
            </td>
        </tr>
        <tr>
            <td class="text-center" colspan="2">
                <label>New Admin:</label>
                <a  href="registerAdmin.jsp">Click Here</a>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
