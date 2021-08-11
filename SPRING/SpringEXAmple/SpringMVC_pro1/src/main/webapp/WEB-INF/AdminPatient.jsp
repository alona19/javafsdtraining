<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Patient</title>
</head>
<body>
<h1>Patient details</h1>

<div align="center">
<table border="1px">

<tr>
<th>Patient Id</th>
<th>Patient Name</th>
<th>Patient Age</th>
<th>Patient Gender</th>
<th>Patient Address</th>
<th>Patient Phoneno</th>

</tr>
<c:forEach var="pat" items="${list}">


<tr>
<th>${ pat.pid}</th>
<th>${ pat.pname}</th>
<th>${ pat.age}</th>
<th>${ pat.gender}</th>
<th>${ pat.address}</th>
<th>${ pat.phoneno}</th>

</tr>
</c:forEach>
</table>

<br/>
<a href = "inspat">Add New Patient</a>
<br/>
<br/>
</body>
</html>