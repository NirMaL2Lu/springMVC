<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>
<h1 style="color: olive;">${Header }</h1>
<h2 style="color: maroon;">${Desc }</h2>

<!-- this is for @requestparam print -->
<%-- <h3>Your name is : ${name }</h3>
<h3>Your email is : ${email }</h3>
<h3>Your password is : ${password }</h3> --%>

<!-- and this is for @modelAttribute print -->
<h3 style="color: green;"> ${msg }</h3>
<h3>Your name is : ${user.name }</h3>
<h3>Your email is : ${user.email }</h3>
<h3>Your password is : ${user.password }</h3>

</body>
</html>