<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>User registration example</h3>
	<form action="forwardServlet" method="post" name="form1">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="username"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td>Bio</td>
				<td><textarea rows="5" cols="50" name="bio"></textarea> </td>
			</tr>
			
				<td>
					<input type="submit" value="Submit">&nbsp;
					<input type="reset">
				</td>
				<td></td>
		</table>
		<input type = "hidden" name = "hddTest" value = "Y"/>
	</form>

</body>
</html>