<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="io.narayanan.dto.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successful login</title>
</head>
<body>
User Login success!!<br>
<% User user = (User) session.getAttribute("user");
String userName = user.getUserName();
String display = "";
if (userName.contains("New User")) display += "Hello! You are a new user. Your userId is: " + user.getUserId();
else display += "Hello! " + userName;
%>
<%= display %> !
</body>
</html>