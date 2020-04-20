package test;

import java.sql.*;

public class BatchUpdateDemo3 
{
	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		
		String query="insert into product_master values(?,?,?)";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm9", "root", "akshay");

			pstmt=con.prepareStatement(query);
			
			pstmt.setInt(1, 0);
			pstmt.setString(2, "TV");
			pstmt.setDouble(3, 65000.25);
			
			pstmt.addBatch();
			
			pstmt.setInt(1, 0);
			pstmt.setString(2, "FRIDGE");
			pstmt.setDouble(3, 35000.24);
			
			pstmt.addBatch();
			
			int[] arr1=pstmt.executeBatch();
			
			System.out.println(arr1.length+" RECORDS INSERTED");
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
			if(pstmt!=null)
			{
				try 
				{
					pstmt.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}
