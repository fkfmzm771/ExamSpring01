<%--
  Created by IntelliJ IDEA.
  User: hyunungLim
  Date: 2019-01-02
  Time: 오전 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>[ JSTL - 포매팅 라이브러리 사용 연습 ]</h1>
<h2>* formatDate - 날짜, 시간 출력</h2>
<fmt:formatDate value="${today }" type="date" /><br>
<fmt:formatDate value="${today }" type="time" /><br>
<fmt:formatDate value="${today }" type="both" /><br>
<fmt:formatDate value="${today }" type="date" pattern="yyyy년 MM월 dd일 E요일" /><br>
<fmt:formatDate value="${today }" type="time" pattern="hh시 mm분 ss초" /><br>

<h2>* formatNumber - 수치 형식</h2>
<fmt:formatNumber value="${num1 }" pattern="#,###.00"/><br>
<fmt:formatNumber value="${num2 }" pattern="#,###.00"/><br>
<fmt:formatNumber value="${num3 }" pattern="0.0 %"/><br>
</body>
</html>
