<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 08-11-2023
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>forgot-Password</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <style>
        .main{
            box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px;
            background-color: lightblue;
        }
        body{
            margin-top: 120px;
            background: rgb(214,214,234);
            background: linear-gradient(90deg, rgba(214,214,234,1) 26%, rgba(1,237,247,1) 100%);
        }
        .mb-4{
            text-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px;
        }
    </style>
</head>
<body>

<div class="container col-lg-4 p-3   main">
    <h2 class="text-center mb-4 text-info">Forgot Password</h2>
    <form action="" method="post">
        <label>Current Password</label>
        <input class="form-control" type="password" name="current" >
        <label>New Password</label>
        <input class="form-control" type="password" name="new" >
        <label>Confirm Password</label>
        <input class="form-control" type="password" name="confirm" >
        <div align="center" class="mt-3">
            <input type="submit" value="Change Password" class="btn btn-info " >
        </div>
    </form>
</div>
</body>

</html>