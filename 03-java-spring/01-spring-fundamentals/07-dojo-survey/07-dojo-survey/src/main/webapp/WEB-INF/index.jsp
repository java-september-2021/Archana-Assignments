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
<form action="welcome">

<p> Name: <input type="text" name="firstName"></p>
<p> Email: <input type="text" name="email"></p>

<p> Program: 
<select name="program">
<option value="java"> Java</option>
<option value ="mern">Mern</option>
<option value= "python">Python</option>
</select>
</p>
<p> <button>Try Code</button></p>
</form>


</body>
</html>