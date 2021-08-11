<%@page import="com.ust.controller.MedicineDao"%>
<%@page import="com.ust.controller.Medicine"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Med</title>
</head>
<body>
	<%
	int mid = Integer.parseInt(request.getParameter("mid"));
	Medicine medicine = new MedicineDao().findById(mid);
	%>
	
	<form action="emed" method="post">
	Medicine Id : <input type="text" name ="mid" value="<%= mid %>" readonly = "readonly"><br/>
	Medicine Name : <input type="text" name ="name" value="<%= medicine.getMname() %>"><br/>
	Medicine Price : <input type="text" name ="price" value="<%= medicine.getPrice() %>"><br/>
	Medicine Quantity : <input type="text" name ="quantity" value="<%= medicine.getQty() %>"><br/> 
	<input type="submit" value="Submit">
	</form>

</body>
</html>