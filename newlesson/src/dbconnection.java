import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class dbconnection {

	public static void main(String[] args) throws SQLException {
		
		Connection conn=null;
		String url = "jdbc:mysql://localhost:3306/"; 
		String dbName = "sakila";
				
		String driver = "com.mysql.jdbc.Driver"; 
		String userName = "root";
		String password = "1234";

		try { 
			Class.forName(driver).newInstance(); 
		 conn = DriverManager.getConnection(url+dbName,userName,password); 

       Statement stmt=conn.createStatement();
       ResultSet rs=stmt.executeQuery("select * from actor limit 10");
       
       while(rs.next())
       {
    	   System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
       }
       

		}catch(Exception e)
		
		{
			
		}finally
		{
			conn.close();
		}
				

	}

}
