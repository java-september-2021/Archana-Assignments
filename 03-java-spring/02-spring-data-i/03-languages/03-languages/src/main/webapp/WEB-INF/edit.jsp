<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>edit page</title>
</head>
<body>
<a href="/">Dashboard</a> |<a href="/delete/{id}">Delete</a>
<hr>
<form:form action="/edit/${language.id}" method="POST" modelAttribute="language">
<p>Edit a  Language</p>
<form:label path="name">Name:</form:label>
<form:errors path="name"/>
<form:input path="name"/>
<hr>
<form:label path="creator">Creator</form:label>
<form:errors path="creator"/>
<form:input path="creator"/>

<hr>
<form:label path="currentVersion">Current Version</form:label>
<form:errors path ="currentVersion"/>
<form:input path="currentVersion"/>
<hr>
<input type="hidden" name="_method" value="put">

<button>Edit New Language</button>



</form:form>
</body>
</html>