<%-- 
    Document   : besoin
    Created on : 18 janv. 2019, 20:26:52
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
        <jsp:declaration>
            String username="";
            
        </jsp:declaration>
        <jsp:scriptlet>
            username=request.getParameter("username");
        </jsp:scriptlet>  
        <jsp:expression> username </jsp:expression>
       
        <form action="AddBesoin" method="Post" >
        <table>
            <tr>
                <td>id user:</td>
                <td><input type="number"  name="id_besoin" value=""></td>
               
            </tr>
            <tr>
                <td>categorie:</td>
                <td><input type="text"  name="categorie" value=""></td>
                
            </tr>
            <tr>
                <td>description:</td>
                <td><input type="text"  name="description" value=""></td>
            </tr>
           
           
                <td>
                    
                    <input type="submit" name="Ajouter" value="Ajouter">
                    
                </td>
                
            </tr>
        </table>
        </form>
    </body>
</html>
