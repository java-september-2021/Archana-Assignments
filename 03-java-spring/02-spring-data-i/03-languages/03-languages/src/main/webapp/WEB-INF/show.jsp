<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java</title>
</head>
<body>
<a href="/">Dashboard</a>
	<hr>

		<c:out value="${ thisLang.name}"></c:out>
	<hr>
	
		<c:out value="${ thisLang.creator}"></c:out>
	<hr>
		<c:out value="${ thisLang.currentVersion}"></c:out>
	<p><a href="/edit/${ thisLang.id}">Edit</a></p>
	
	<form action="/delete/${thisLang.id}" Method="Post" >
	<input type="hidden" name="_method" value="delete">
	<button>Delete Language</button>
	
	
	
	
	</form>
	





	
</body>
</html>