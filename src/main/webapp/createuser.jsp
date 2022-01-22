<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create user</title>
</head>
<body>
<%
	String name = (String)session.getAttribute("name"); 
	if(name == null) {
		response.sendRedirect("Login.jsp");
	}
%>
<%@ include file="mynavbar.jsp" %>
	<h1>Enter the user data</h1>
</body>
</html>