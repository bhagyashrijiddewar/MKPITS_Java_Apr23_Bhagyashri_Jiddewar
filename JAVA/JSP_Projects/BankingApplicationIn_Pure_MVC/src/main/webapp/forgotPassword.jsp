<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 08-11-2023
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>
<main class="login-form">
    <div class="cotainer">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <div class="card">
                    <div class="card-header">
                        ResetPassword
                        <h6 style="color: red;"><%= ServletUtility.getErrorMessage(request) %></h6>
                        <h6 style="color: green;"><%= ServletUtility.getSuccessMessage(request)%></h6>
                    </div>
                    <div class="card-body">
                        <form action="/javawebapp/ForgetPasswordCTL" method="post">
                            <div class="form-group row">
                                <label
                                       class="col-md-4 col-form-label text-md-right">Enter Email id<font color="red">*</font></label>
                                <div class="col-md-6">
                                    <input type="text" id="email"  class="form-control" placeholder="Enter Login Id"
                                           name="email" value="" >
                                    <font  color="red"></font>
                                </div>
                            </div>
                            <div class="col-md-6 offset-md-4">
                                <input type="submit" class="btn btn-primary" value="Get your password">

                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>
<div style="margin-top: 170px">
</div>
