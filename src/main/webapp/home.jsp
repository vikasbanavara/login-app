<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<body>

<%
	String name = (String)session.getAttribute("name"); 
	if(name == null) {
		response.sendRedirect("Login.jsp");
	}
%>

<%@ include file="mynavbar.jsp" %>

<h1>Hi I am in home page</h1>

</body>
</html>
