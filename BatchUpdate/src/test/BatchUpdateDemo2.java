package test;

import java.sql.*;

public class BatchUpdateDemo2 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt=null;
		
		String query1="insert into product_master values(4,'NOTEPAD',1000.25)";
		String query2="delete from product_master where product_id=2";
		String query3="update product_master set product_price=50000.20 where product_id=3";

		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm9", "root", "akshay");

			stmt=con.createStatement();
			
			stmt.addBatch(query1);
			stmt.addBatch(query2);
			stmt.addBatch(query3);
			
			int[] arr1=stmt.executeBatch();
			
			stmt.clearBatch();
			
			System.out.println(arr1.length+" RECORDS AFFECTED");

		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(con!=null)
			{
				try 
				{
					con.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if(stmt!=null)
			{
				try 
				{
					stmt.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
	
	}
}
