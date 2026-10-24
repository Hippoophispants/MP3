<%-- 
    Document   : error
    Created on : Oct 20, 2026, 9:37:48 PM
    Author     : Nitro V15
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Error</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/global.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/error-style.css">
    </head>
    <body>
        ${applicationScope.headerContent}
        <h1>Login Failed</h1>
        <div role="alert">
            <ul>
                <c:forEach var="errorMessage" items="${requestScope.errorMessages}">
                    <li><c:out value="${errorMessage}"/></li>
                </c:forEach>
            </ul>
        </div>
        <p><a href="${pageContext.request.contextPath}/index.jsp">Return to login</a></p>
        ${applicationScope.footerContent}
    </body>
</html>
