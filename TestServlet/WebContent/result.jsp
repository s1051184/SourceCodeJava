<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>result page</h1>
<% 
		String username = (String)request.getAttribute("username");
		String password = (String)request.getAttribute("password");
		String bio = (String)request.getAttribute("bio");
%>
<h1>Noi test</h1>
Username :<%=username %><br>
Password :<%=password %><br>
Bio :<%=bio %><br>

<h1>Fon test(using EL)</h1>
<!-- Because of use setAttribute, can use ${username} without sessionScope-->
<!-- If use setSession have to use ${sessionScope.username} to get the value-->
Username :${username}<br>
Password :${password}<br>
Bio :${bio}

</body>
</html>