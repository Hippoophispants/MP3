<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success Page</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/global.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/login-style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/success-style.css">
    </head>
  
    <body class="${param.inputString == null ? 'no-results' : ''}">
        <jsp:include page="header.jsp" />
        <h1>Enter a String</h1>
        <form method="post" action="${pageContext.request.contextPath}/CharacterCountingServlet">
            <input type="text" id="inputString" name="inputString" class="inputstring" placeholder="Type your string here">
            <input type="submit" value="Submit">
        </form>
        <% if (request.getParameter("inputString") != null) { %>
            <h2><c:out value="${param.inputString}" /></h2>
            <ul>
                <li>String length: <strong><%= request.getAttribute("characterCount") %></strong></li>
                <li>Number of digits: <strong><%= request.getAttribute("digitCount") %></strong></li>
                <li>Number of vowels: <strong><%= request.getAttribute("vowelCount") %></strong></li>
                <li>Number of consonants: <strong><%= request.getAttribute("consonantCount") %></strong></li>
                <li>Number of symbols: <strong><%= request.getAttribute("symbolCount") %></strong></li>
            </ul>
        <% } %>
        <jsp:include page="footer.jsp" />
    </body>
</html>
