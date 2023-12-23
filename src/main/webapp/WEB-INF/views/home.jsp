<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>hii this home page</h1>
<h1>this is my 1st springMVC program</h1>
		<% 
		String name=(String)request.getAttribute("name");
		Integer id =(Integer)request.getAttribute("id");
		List<String> friends = (List<String>)request.getAttribute("f");
		
		%>
		
		<h1>
		Name is :: <%= name %>
		<br>
		Id is ::<%=id %></h1>
		<h1>friends are ::</h1>
		<%
		for(String s:friends){
			%>
			
			<h1><%=s %></h1>
			<% 
		}
		%>


</body>
</html>