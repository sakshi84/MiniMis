
package bean;  
import java.sql.*;  
import static bean.Provider.*;  
  
public class ConnectionProvider {  
		private static Connection con=null;  
			static{  
				try{  
					Class.forName("com.mysql.jdbc.Driver");  
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","anshul46");  
					}catch(Exception e){}  
			}  
  
			public static Connection getCon(){  
					return con;  
			}  
}  
