<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

<meta charset="UTF-8">
<title>Languages</title>
</head>
<body>

<div class="container">

<table class="table table-striped table-dark">

	<thead>
			<tr>
			<th>Name</th>
			<th>Creator</th>
			<th> Version</th>
			<th>Action</th>
	
			</tr>
			
	</thead>
	<tbody>
		<c:forEach items="${allLanguages}" var="lang">
			<tr>
				
					<td><a href="/show/${lang.id}">${lang.name}</a></td>
					<td>${lang.creator}</td>
					<td>${lang.currentVersion}</td>
					<td><a href="/edit/${lang.id}">Edit</a>| <a href="/delete/${lang.id }">Delete</a></td>
			
			</tr>
			
		</c:forEach>
	</tbody>
	</table>
	
<form:form action="/" method="POST" modelAttribute="language">
<p>Create a New Language</p>
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

<button>Create New Language</button>



</form:form>

</div>
</body>
</html>