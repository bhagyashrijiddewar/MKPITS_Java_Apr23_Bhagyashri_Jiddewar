<%@ page import="bankingServices.Services" %>
<%@ page import="java.sql.ResultSet" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<jsp:useBean id="bank" class="com.example.bankingapplicationin_pure_mvc.BankAccountDetails" scope="application"/>
<jsp:useBean id="log" class="com.example.bankingapplicationin_pure_mvc.TotalLogs" scope="application"/>

<jsp:setProperty name="bank" property="userid" param="userid"/>
<jsp:setProperty name="bank" property="password" param="password"/>
<jsp:setProperty name="bank" property="creationOn" value='<%= new java.sql.Timestamp(session.getCreationTime())%>'/>


<%
    out.println(bank.getCreationOn());
    session.setAttribute("logDate",bank.getCreationOn());
    session.setAttribute("userId",bank.getUserid());
%>
<jsp:setProperty name="log" property="logTime" value='<%= session.getAttribute("logDate")%>'/>
<jsp:setProperty name="log" property="userId" value='<%= session.getAttribute("userId")%>'/>
<jsp:setProperty name="log" property="taskDone" value="Login"/>
<%
    Services services = new Services();
    ResultSet resultSet = services.loginRecord(bank);
    try {
        if(resultSet.next()){
            out.println("Login successfully");
            services.logRecord(log);

           RequestDispatcher requestDispatcher= request.getRequestDispatcher("../homePage.jsp");
           requestDispatcher.forward(request,response);

            HttpSession httpSession= request.getSession();
            session.setAttribute("user_id",bank.getUserid());
        }else{
            out.println("Failed to login");
        }
    } catch (Exception e) {
       out.println(e);
    }
%>
