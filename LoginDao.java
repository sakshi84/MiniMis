package bean;  
//import java.beans.beancontext.BeanContextMembershipEvent;
import java.sql.*;  
public class LoginDao {  
  
public static boolean validate(LoginBean bean){  
	boolean status=false;  
try{  
	//Class.forName("com.mysql.jdbc.Driver");
	Connection con=ConnectionProvider.getCon();  
   String email = bean.getEmail();
   String pass = bean.getPass();
PreparedStatement ps=con.prepareStatement("select * from USER where email=? and pass=?");  
ps.setString(1,email);  
ps.setString(2,pass);  
              
ResultSet rs=ps.executeQuery(); 

status=rs.next();  

              
}catch(Exception e){
	System.out.println(e);
}  
  
return status;  
  
}  
}  