<%@page import="com.ust.controller.PatientDao"%>
<%@page import="com.ust.controller.Patient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	int pid = Integer.parseInt(request.getParameter("pid"));
	Patient patient = new PatientDao().findById(pid);
	%>
	
	<form action="epat" method="post">
	Patient Id : <input type="text" name ="pid" value="<%= pid %>" readonly = "readonly"><br/>
	Patient Name : <input type="text" name ="name" value="<%= patient.getPname() %>"><br/>
	Patient Age : <input type="text" name ="name" value="<%= patient.getAge() %>"><br/>
	Patient Gender :<input type="text" name ="name" value="<%= patient.getPname() %>"><br/>
	Patient Address : <input type="text" name ="address" value="<%= patient.getAddress() %>"><br/>
	Patient Phone : <input type="text" name ="pjno" value="<%= patient.getPhoneno() %>"><br/>

	<input type="submit" value="Submit">
	</form>
</body>
</html>