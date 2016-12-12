<%@page import="bean.LoginDao"%> 
<%@page import="bean.LoginBean" %> 
<jsp:useBean id="obj" class="bean.LoginBean"/>  
  
<jsp:setProperty property="*" name="obj"/>  
 
<%  
LoginBean b = new LoginBean();
b.setEmail(request.getParameter("email"));
b.setPass(request.getParameter("password"));
//System.out.println(b.getEmail()+b.getPass());
boolean status=LoginDao.validate(b);  
if(status){  
%> 
 <%@include  file="menu.html" %>
 <% 
session.setAttribute("session","TRUE");  
}  
else  
{  
out.print("Sorry, email or password error");  
}
%>  
  