<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help</title>
</head>
<body>

	<%
	
	/* String name = (String)request.getAttribute("name");
	Integer rollno = (Integer)request.getAttribute("rollno");
	LocalDateTime now =(LocalDateTime)request.getAttribute("time");
	 */
	%>
	
	
	
	<h1>
	Name is ::
	${name}
	<%--  <%=name %> --%>
	</h1>
	<h1>Roll no is :: 
	<%-- <%=rollno %> --%>
	${rollno }
	</h1>
	<h1>Today date and time is :: 
	<%-- <%=now.toString() %> --%>
	${time }
	</h1>
	<h1>The Languages are :: </h1>
	<h1>
	
	<c:forEach var="languages" items="${locale }">
	${languages }
	</c:forEach>
	</h1>
	<h1>The Countries are :: </h1>
	<h1>
	
	<c:forEach var="country" items="${countries }">
	${country }
	</c:forEach>
	
	</h1>
	
	<%-- <h1>Marks :: 
	${marks }
	</h1> --%>
	<!-- using jstl tags -->
	<h1>Marks are :</h1>
	<c:forEach var="item" items="${marks }">
	<%-- <h1>${item }</h1> --%>
	
	<h1><c:out value="${item }"></c:out></h1>
	</c:forEach>


</body>
</html>