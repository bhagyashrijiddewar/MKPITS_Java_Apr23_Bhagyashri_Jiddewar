<%@ page import="bankingServices.Services" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bank" class="com.example.bankingapplicationin_pure_mvc.BankAccountDetails" scope="application"/>
<jsp:useBean id="admin" class="com.example.bankingapplicationin_pure_mvc.AdminLogin" scope="application"/>
<jsp:setProperty name="bank" property="approvedAt" value='<%= new java.sql.Timestamp(session.getCreationTime())%>'/>
<%
   String uId= request.getParameter("userId");
    session.setAttribute("adminId",admin.getAdminId());
    %>
<jsp:setProperty name="bank" property="approvedBy" value='<%= session.getAttribute("adminId")%>'/>
<%
    Services services=new Services();
    if(services.isApprovalByAdmin(bank,uId)!=0){
        response.sendRedirect("admin_JSP.jsp");

    }else {
        out.println("Failed to approved");
    }
%>
