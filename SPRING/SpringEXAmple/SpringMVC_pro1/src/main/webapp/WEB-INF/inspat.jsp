<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert Patient</title>
</head>
<body>

	<form action="inpat" method="post">
	Patient Id : <input type="text" placeholder = "Enter the patient id" name ="pid"><br/>
	Patient Name : <input type="text" placeholder = "Enter the patient name" " name ="pname"><br/>
	Patient age : <input type="text" placeholder = "Enter the age " name ="age"><br/>
	Patient gender : <input type="text" placeholder = "Enter the gender " name ="gender"><br/>
	Patient address : <input type="text"placeholder = "Enter the address" name ="address"><br/>
	Patient phoneno : <input type="text"placeholder = "Enter the phone number" name ="phoneno"><br>
	<input type="submit" value="Submit"><br/>
	<input type="reset" value="Cancel">
	</form>

</body>
</html>