<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Products Details Page</h3>
<c:set var="product" value="${obj }"></c:set>
Id: ${product.id } <br>
Name: ${product.name } <br>
Price: ${product.price } <br>
Date: ${product.dateAdded } <br><br>
<a href="edit.jsp">Click here to edit</a> <br><br>
<a href="index.jsp">Click here go to home page</a>
</body>
</html>