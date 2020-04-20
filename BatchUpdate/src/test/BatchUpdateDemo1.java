package test;

import java.sql.*;

public class BatchUpdateDemo1 //DML
{

	public static void main(String[] args) 
	{
		//DECLARE RESOURCES
		Connection con=null;
		Statement stmt=null;
		
		//CREATE SQL QUERIES
		String query1="insert into product_master values(1,'AC',25000.25)";
		String query2="insert into product_master values(2,'LAPTOP',35000.20)";
		String query3="insert into product_master values(3,'MOBILE',15000.25)";
		
		//CONNECTIVITY STEPS
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm9", "root", "akshay");
		
			stmt=con.createStatement();
			
			//add queries into the batch
			
			stmt.addBatch(query1);
			stmt.addBatch(query2);
			stmt.addBatch(query3);
			
			//execute batch of sql statements
			int[] arr1=stmt.executeBatch();
			
			System.out.println(arr1.length+" RECORDS INSERTED SUCCESSFULLY");
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
