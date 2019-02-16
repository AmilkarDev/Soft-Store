<%-- 
    Document   : testlogin
    Created on : 19 janv. 2019, 16:51:27
    Author     : LENOVO
--%>
<%@page import="models.User_"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <% 
         String _username=request.getParameter("username");
             String _password=request.getParameter("password");
            // String a="hello";
             
             if(_username!=null && _password!=null)
             { if(_username.equals(username) && _password.equals(password))
             response.sendRedirect("addBesoin.jsp");
             else{
                 response.sendRedirect("login.jsp");
                  // out.print("erruuuuuuuur") ;
             }
             }
             else{response.sendRedirect("login.jsp");}
        %>
            
        
    </body>
</html>
