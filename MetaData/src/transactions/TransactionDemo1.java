package transactions;

import java.sql.*;

public class TransactionDemo1 
{

	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt=null;

		String query="delete from product_master where product_id=6";
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm9","root","akshay");
			
			con.setAutoCommit(false);
			
			stmt=con.createStatement();
			
			int count=stmt.executeUpdate(query);
			
			con.rollback();
			
			System.out.println(count+" RECORD DELETED");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
