<%@ page import="models.User" %><%--
  Created by IntelliJ IDEA.
  User: smoldyrev
  Date: 22.02.17
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>spisok</title>
</head>
<body>
<h1>SPISOK</h1>
<%--JSP TAG внутри тэга код Java--%>
<%= request.getParameter("name") %>
<%= request.getAttribute("myParam") %>

<% String message = "emptyMessage";
    User user = (User) request.getAttribute("user");
    if (user.type == 3) {
        message = "notEmptyMessage";
    }%>
<%=message %>

<c:forEach items="${userList}" var="userItem">
    <c:out value="${userItem.name}"></c:out>
    <%--<c:out value="${userItem.name}"></c:out>--%>
    <c:out value="${userItem.type}"></c:out>
</c:forEach>

</body>
</html>
