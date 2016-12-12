package bean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import bean.LoginBean;
import bean.grade;
import java.util.*;

public class gradeDao {

	
	public static ArrayList<grade> Grades_from_database(grade c)
	{
		
		ArrayList<grade> list =new ArrayList<grade>();
		try{
			Connection con=ConnectionProvider.getCon();
			Statement stmt = con.createStatement();
            Student_details s = new Student_details();
	        ResultSet rs = stmt.executeQuery("select course_id,grade from grade where roll_no = '" +s.getRoll_No()+"'");
//	        System.out.println(s.getRoll_No());
//	        ResultSet rs1 = stmt.executeQuery("select course_id from course where id='"+b.getEmail()+"' and password='"+b.getPass()+"'");
//	        rs.next();
//	        rs1.next();
//	        PreparedStatement ps=con.prepareStatement("select * from grades where roll_no= ? and course_id=?");  
//	        ps.setInt(1, rs.getInt("roll_no"));
//	        ps.setInt(2, rs1.getInt("course_id"));
//	        ResultSet rs2=ps.executeQuery(); 
	        while(rs.next())
	        {
	        	list.add(new grade(rs.getString("grade"),rs.getString("course_id"),s.getRoll_No()));
	        }	 
	     
	        return list;
	        
	        
	        //con.close();
		}catch(Exception e)
		{
			System.out.println(e);
			return null;
		} 
	}
}