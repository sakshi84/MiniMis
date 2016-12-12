<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="bean.StudentDao"%> 
    <%@page import="bean.Studentdetails" %> 
    <jsp:useBean id="obj" class="bean.Studentdetails"/>  
  
<jsp:setProperty property="*" name="obj"/>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta charset="utf-8">
	<title>Student Details</title>

	<!-- Google Fonts -->
	<link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="animate.css">
	<!-- Custom Stylesheet -->
	<link rel="stylesheet" href="style.css">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style type="text/css">
.inputform{float:left;
width:400px;border:1px solid pink;border-radius:10px;padding:10px;
}
.inputform table tr td input,textarea,select{width:200px;}
#gender1,#gender2{width:10px;}
#submit{margin-left:100px;width:100px;}
#reset{width:100px;}
.design{background-color:red;color:white;padding-left:100px;}
</style>
</head>
<body>
<%@include  file="menu.html" %>
<!-- header -->
<h2>Student Details</h2>
<h3 style="background-color:red;color:red;">c</h3>
<!-- body -->

<div class="inputform">
<h2 class="design">Personal Info</h2>

<table>
<%Studentdetails b = new Studentdetails();
StudentDao.Fetch_from_database(b); %>
<tr><td><b><font color='red'>Name:</font></b></td><td><input type="text" name="name" value="<%
out.println(b.getName());
%>" readonly/></td></tr>
<tr><td><b><font color='red'>Roll No:</font></b></td><td><input type="text" name="name" value="<%
out.println(b.getRoll_No());
%>" readonly/></td></tr>
<tr><td><b><font color='red'>Email:</font></b></td><td><input type="text" name="email" value="<%
out.println(b.getEmail());
%>" readonly/></td></tr>

<tr><td><b><font color='red'>Gender:</font></b></td><td><input id="gender1" type="radio" name="gender" value="male" checked="checked"/>Male 
<input type="radio" id="gender2" name="gender" value="female"/>Female
</td></tr>
<tr><td><b><font color='red'>Date Of Birth:</font></b></td><td><input type="text" name="dob" value="<%out.println(b.getDate_Of_Birth());%>" readonly/></td></tr>

<tr><td><b><font color='red'>Contact:</font></b></td><td><input type="text" name="contact" value="<%out.println(b.getContact()); %>" readonly/></td></tr>
</table>

</div>
</body>

<body>
<div class="inputform">
<h2 class="design">Admission Details</h2>

<table>

<tr><td><b><font color='red'>Date of Admission:</font></b></td><td><input type="text" name="name" value="<%out.println(b.getDate_of_Admission());%>"readonly/></td></tr>
<tr><td><b><font color='red'>Admission Batch:</font></b></td><td><input type="text" name="name" value="<%out.println(b.getAdmission_Batch());%>"readonly/></td></tr>
<tr><td><b><font color='red'>Branch:</font></b></td><td><input type="text" name="city" value="<%out.println(b.getBranch()); %>"readonly/></td></tr>
<tr><td><b><font color='red'>Degree:</font></b></td><td><input type="text" name="state" value="<%out.println(b.getDegree()); %>"readonly/></td></tr>

</table>

</div>






</body>
</html>