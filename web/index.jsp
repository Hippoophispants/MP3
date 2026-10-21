<!-- <%-- 
    Document   : index
    Created on : Oct 20, 2026, 9:29:57 PM
    Author     : Nitro V15
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> -->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MP3 Login</title>
        <link rel="stylesheet" href="./global.css">
        <link rel="stylesheet" href="./login-style.css">
    </head>
    <body>
        ${applicationScope.headerContent}
        <h1>Login</h1>
            <form method="post" action="<%= request.getContextPath() %>/LoginServlet">
              <label for="username">Username</label>
              <input type="text" id="username" name="username">
               <br><br>
               <label for="password">Password</label>
               <input type="password" id="password" name="password">
               <br><br>
               <input type="submit" value="Sign in">
        </form>
    </body>
    ${applicationScope.footerContent}
</html>
