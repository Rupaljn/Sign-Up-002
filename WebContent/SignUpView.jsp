<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align = "center"> Sign Up Page</h1>
<form action="StudentRegistrationController" method = "post">
<label> Full Name </label>
<input name = fullName  type = "text">
<br> <br> <br>
<label> Email Id </label>
<input name = "emailId" type = "text">
<br> <br> <br>
<label> Contact Number</label>
<input name = "contactNumber" type = "number">
<br> <br> <br>
<label> Password </label>
<input name = "password" type = "password">
<br> <br> <br>
<input type = "submit">

</form>

</body>
</html>