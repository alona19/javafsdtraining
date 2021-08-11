<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> ${login}  </h1>
<form action="login" method = "post">
<h3>Enter Login Details</h3>

	USER ID : <input type= "text" name = "user_id"><br/>
	Password: <input type= "password" name = "password"><br/>
	<input type="submit" value = "submit"><br/>
	<input type="reset" value = "cancel">
</form>
</body>
</html>