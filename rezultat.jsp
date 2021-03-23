<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Rezultatul adunarii este:<c:out value="${suma}"/><br/>
Minimul este:<c:out value="${min}"/><br/>
Maximul este:<c:out value="${max}"/><br/>
Media Aritmetica este:<c:out value="${arit}"/><br/>
Ordonarea crescatoare a numerelor este:
 <c:forEach 
 	items="${aux}"
 	var="i"
 	begin="0">
 <c:out value="${i}"/>
 </c:forEach><br/>
</body>
</html>