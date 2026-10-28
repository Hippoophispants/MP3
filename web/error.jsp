<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Error</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/global.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/error-style.css">
    </head>
    
    <body class="error-page">
        <jsp:include page="header.jsp" />
        <main class="error-content">
            <h1>Error</h1>
            <h2>Login Failed</h2>
            <div class="error-details">
                <img class="error-duck" src="${pageContext.request.contextPath}/images/confused-duck.png" alt="Confused duck">
                <div class="error-messages" role="alert">
                    <ul>
                        <c:forEach var="errorMessage" items="${requestScope.errorMessages}">
                            <li><c:out value="${errorMessage}"/></li>
                        </c:forEach>
                    </ul>   
                    <a class="return-link" href="${pageContext.request.contextPath}/index.jsp">← Back to Homepage</a>
                </div>
            </div>
        </main>
    <jsp:include page="footer.jsp" />
    </body>
</html>
