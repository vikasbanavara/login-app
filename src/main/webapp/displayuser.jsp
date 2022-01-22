<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users list</title>
</head>
<body>
<%
	String name = (String)session.getAttribute("name"); 
	if(name == null) {
		response.sendRedirect("Login.jsp");
	}
%>
<%@ include file="mynavbar.jsp" %>
	<h1>User list</h1>
</body>
</html>