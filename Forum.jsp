<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="bean.LoginBean"%>
    <%@page import="bean.ForumDao"%>
    <%@page import="bean.Forum" %> 
    <jsp:useBean id="obj" class="bean.Forum"/>  
  
<jsp:setProperty property="*" name="obj"/>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta charset="utf-8">
	<title>	FORUM </title>

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

<!-- header -->
<h2 style="color:Red;text-align:center" >FORUM</h2>
<h3 style="background-color:red;color:red;">.</h3>
<!-- body -->

<div class="container" align="center">
		
			<%
				LoginBean b=new LoginBean();
				Forum f = new Forum();
				ForumDao fd=new ForumDao();
				int i,j,n=0,m=0;
				n=fd.NoQue();
//				System.out.println(n+"$#$#$#");
					for(i=1;i<=n;i++){
			%>
<table  width="400" height="50">
				<tr><td><b><font color='Red'>
				<%
					out.println("Que:"+f.getMemberid());
				%>
			</font></b></td><td><input type="text" size="80" name="name" value="
			
			<%
			fd.Fetch_Que(f,i);
			out.println(f.getQue(i));
			
			%>" readonly/></td></tr>
			
			<%
				m=f.getTAns();
				for(j=1;j<=m;j++){
					System.out.println("@"+f.getTAns());
						fd.Fetch_Ans(f,i,j); 
			%>
			
			<tr><td><b><font color='Red'><%
			out.println("Ans:"+b.getEmail());
			%>
			</font></b></td><td><input type="text" name="name" size="80" value="
			
			<%
			out.println(f.getAns(j));
			%>" readonly/></td></tr>
			
			<%
				}
			%>
			
</table>
<form method="post" action="Forum.jsp">
			<label for="Queid"><font color='Red'>
			</font></label>
			<input type="text"  name="Ans" id="Question" size="80"/>
			<% 	String a=request.getParameter("Ans");
				//System.out.println(s);
			
				fd.NewAns(f,m,a,n);
			//rumDao.NewQue(); %>
			<button type="submit">Post</button>
</form>
			<br/>
			<br/>
		<%
			}
		
		%>
			<br/>
			<br/>
<form method="post" action="Forum.jsp">
			
			<label for="QUESTION">Question</label>
			<br/>
			<input type="text" name="que" id="q" />
			<% 	String s=request.getParameter("que");
				//System.out.println(s);
			
				fd.NewQue(f,n,s);
			//rumDao.NewQue(); %>
			<button type="submit">Post</button>
</form>
			
			
		
	</div>
</body>

<body> 
<div class="inputform">


</div>
</body>
</html>