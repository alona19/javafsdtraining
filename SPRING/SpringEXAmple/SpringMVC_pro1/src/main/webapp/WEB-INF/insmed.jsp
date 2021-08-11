<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert Medicines</title>
</head>
<body>

	<form action="inmed" method="post">
	Medicine Id : <input type="text" placeholder = "Enter the medicine id" name ="mid"><br/>
	Medicine Name : <input type="text"  placeholder = "Enter the medicine name" name ="name"><br/>
	Medicine Price : <input type="text" placeholder = "Enter the medicine price" name ="price"><br/>
	Medicine Quantity : <input type = "text"  placeholder = "Enter the medicine quantity" name = "qty"><br/>
	<input type="submit" value="Submit"><br/>
	<input type="reset" value="Cancel">
	</form>

</body>
</html>