<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>A web page </title>
</head>
<body>

<h1>Hello</h1>
<p> <c:out value="${ name}"></c:out> </p>

</body>
</html>