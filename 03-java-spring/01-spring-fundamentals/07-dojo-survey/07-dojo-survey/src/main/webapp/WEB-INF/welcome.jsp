<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Servey Index</title>
</head>
<body>
<h1>Welcome </h1>
<h2> Submitted Info </h2>
<p> <c:out value="${firstName}"></c:out>
<p> <c:out value="${email}"></c:out>
<p> <c:out value="${program}"></c:out>

</body>
</html>