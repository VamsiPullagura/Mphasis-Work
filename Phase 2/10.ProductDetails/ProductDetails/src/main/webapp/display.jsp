<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>PRODUCT DETAILS!</h1>
<%
String name=request.getParameter("name");
int size=Integer.parseInt(request.getParameter("size"));
int rate=Integer.parseInt(request.getParameter("rate"));
out.println("Product Name:" +name);
out.println("<br><br>");
out.println("Product Size:" +size);
out.println("<br><br>");
out.println("Product Rate:" +rate);
%>
</body>
</html>