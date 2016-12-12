package bean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import bean.LoginBean;
import bean.Student_details;

public class StudentDao {

	
	public static void Fetch_from_database(Studentdetails c)
	{
		try{
			Connection con=ConnectionProvider.getCon();
			Statement stmt = con.createStatement();
	        LoginBean b = new LoginBean();

	        ResultSet rs = stmt.executeQuery("select SNo from USER where email='"+b.getEmail()+"' and pass='"+b.getPass()+"'");
	        rs.next();
	        PreparedStatement ps=con.prepareStatement("select * from STUDENT where SNo = ?");  
	        ps.setInt(1, rs.getInt("SNo"));
	        ResultSet rs1=ps.executeQuery(); 
	        while(rs1.next())
	        {
	        	 c.setName(rs1.getString("Name"));
	        	 c.setRoll_No(rs1.getString("RollNo"));
	        	 c.setEmail(rs1.getString("email"));
	        	 c.setDate_Of_Birth(rs1.getDate("dob").toString());
	        	 c.setContact(rs1.getString("contact"));
	        	 c.setDate_of_Admission(rs1.getDate("doa").toString());
	        	 c.setBranch(rs1.getString("branch"));
	        	 c.setDegree(rs1.getString("degree"));
	        	 
	        }	 
	     
	        //con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		} 
	}
}