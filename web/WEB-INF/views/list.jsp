<%--
  Created by IntelliJ IDEA.
  User: hyunungLim
  Date: 2019-01-04
  Time: 오전 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>회원목록</h1>

<c:forEach var="memver" items="${list}">
    ID : ${memver.id}
    NAME : ${memver.name}
    <a href="delete?id=${member.id}">삭제</a>
    <br>

</c:forEach>

</body>
</html>
