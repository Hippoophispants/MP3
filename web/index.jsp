<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MP3 Login</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/global.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/login-style.css">
    </head>
   
    <body class="login-page">
        <jsp:include page="header.jsp" />
        <h1>Login</h1>
        <form class="login-form" method="post" action="<%= request.getContextPath() %>/LoginServlet">
            <input type="text" id="username" name="username" placeholder="username">
            <input type="password" id="password" name="password" placeholder="password">
            <input type="submit" value="Sign In">
        </form>
        <jsp:include page="footer.jsp" />
    </body>
</html>
