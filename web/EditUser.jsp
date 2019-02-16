<%-- 
    Document   : EditUser
    Created on : 18 janv. 2019, 15:11:00
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
             <h1>Edit users</h1>
        <div style="width: 900px; margin-left: auto; margin-right: auto">
                <form action="EditUser0" method="get">
                    
                    id:<br>
                    <input type="number" name="id" value="${getUserById.idUser}">
                    user name :<br>
                     <input type="text" value="${getUserById.username}" name="username" style="width: 200px"><br>
                    password : <br>
                    <input type="text" value="${getUserById.password}" name="password" style="width: 200px"><br>
                    email : <br>
                    <input type="text" value="${getUserById.email}" name="email" style="width: 200px"><br>
                  
                    <input type="submit" value="okiii">
                </form>
        
                  
        </div>
    </body>
</html>
