package bean;
import java.sql.*;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.Statement;



public class ForumDao {
	
	public void Fetch_Que(Forum f,int Q)
	{
		//System.out.println("hello ");
		try{
			//Class.forName("com.mysql.jdbc.Driver");
	        Connection con=ConnectionProvider.getCon();
	        PreparedStatement ps=(PreparedStatement) con.prepareStatement("select * from Que where QId=?");
	        ps.setInt(1,Q);  
	        ResultSet rs = ps.executeQuery();
	        while(rs.next()){
	        	  //System.out.println("hello2222 ");
	        	  f.setQueid(rs.getInt("QId"));
	        	 // System.out.println(rs.getInt("QId"));
	        	  f.setTAns(rs.getInt("TAns"));
	        	  f.setMemberid(rs.getString("MemId"));
		      	  f.setQue(rs.getInt("QId"),rs.getString("Que"));
		      	  //System.out.println("Qestion "+rs.getInt("QId")+"   "+rs.getString("MemId"));
		    }
	    }catch(Exception e){
			System.out.println(e);
			} 
	}
	
	public void Fetch_Ans(Forum f,int Q,int A)
	{
		try{
			Connection con=ConnectionProvider.getCon();
	        PreparedStatement ps1=(PreparedStatement) con.prepareStatement("select * from Ans where QId=? and AId=?");
	        ps1.setInt(1,Q);  
	        ps1.setInt(2,A);
	        ResultSet rs1 = ps1.executeQuery();
	        while(rs1.next()){
	        	  f.setQueid(rs1.getInt("QId"));
	        	  f.setAnsid(rs1.getInt("AId"));
	        	  f.setMemberid(rs1.getString("MemId"));
		      	  f.setAns(rs1.getInt("AId"),rs1.getString("Ans"));
		    }
	    }catch(Exception e){
			System.out.println(e);
			} 
	}
	
	public void NewQue(Forum f,int Q,String str){
		try{
			Connection con=ConnectionProvider.getCon();
			//System.out.println(str+"&&&&&&&&&"+f.Queid);
			Q++;
			PreparedStatement ps1=(PreparedStatement) con.prepareStatement("Insert into Que values(?,?,0,?);");
	        ps1.setString(1,f.getMemberid());
	        ps1.setInt(2,Q);  
	        ps1.setString(3,str);
	        ps1.executeUpdate();
	       // System.out.println(f.getQue(Q)+"@@QUE@@");
	        
	        
	    }catch(Exception e){
			System.out.println(e);
			} 
	}
	
	public void NewAns(Forum f,int A,String str,int Q){
		try{
			Connection con=ConnectionProvider.getCon();
			//request.getParameter("que");
			PreparedStatement ps1=(PreparedStatement) con.prepareStatement(" update Ans set Ans=? where QId=? and AId=?;");
			ps1.setString(1,str);
			ps1.setInt(2,Q);
	        ps1.setInt(3,A);
			PreparedStatement ps2=(PreparedStatement) con.prepareStatement("Insert into Que values(?,?,0,str);");
			//ps1.setString(1,f.getMemberid());
			ps2.setInt(2,A);  
	        ps1.executeUpdate();
	        ps2.executeUpdate();
	        
	    }catch(Exception e){
			System.out.println(e);
			} 
	}
	
	public int NoQue(){
		int i=0;
		try{
			
			Connection con=ConnectionProvider.getCon();
			PreparedStatement ps1=(PreparedStatement) con.prepareStatement(" select count(*) as abc from Que;");
			
			ResultSet rs1 =ps1.executeQuery();
			rs1.next();
			i=rs1.getInt("abc");
			System.out.println("hello");
	   }catch(Exception e){
			System.out.println(e);
			} 
	   return i;
	}
/*
	public static void main(String args[]){
		//Forum f = new Forum();
		//ForumDao fd=new ForumDao();
		//int i,j;
		System.out.println(ForumDao.NoQue()+".........");
		/*for(i=1;i<=2;i++){
			fd.Fetch_Que(f,i);
			System.out.println("@"+f.getTAns());
			for(j=1;j<=f.getTAns();j++)
				fd.Fetch_Ans(f,i,j);
		}*/
	
}