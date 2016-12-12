<%@page import="bean.gradeDao"%>
<%@page import="bean.grade"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<html>

<head>
	<meta charset="utf-8">
	
	<title>GRADE</title>

	<!-- Google Fonts -->
	<link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="animate.css">
	<!-- Custom Stylesheet -->
	<link rel="stylesheet" href="style.css">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
</head>

<body >
<table border="1" width="30%" height="30%">
<%grade b = new grade();
  ArrayList<grade> list = new ArrayList<grade>(); 
  list = gradeDao.Grades_from_database(b); %>

<tr><th><font color='red'> Course_ID </font></th><th><font color='red'> GRADE </font></th></tr>
<%for(grade e:list){ %>
<tr><th><input type="text" name="name" value="<%out.println(e.getCourse_id());%>" readonly/></th>
<th><input type="text" name="name" value="<%out.println(e.getGrade());%>" readonly/></th></tr>
<%} %>

 </table>
     </body>
</html>
