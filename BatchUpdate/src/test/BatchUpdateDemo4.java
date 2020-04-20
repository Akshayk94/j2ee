package test;

import java.sql.*;

public class BatchUpdateDemo4 
{

	public static void main(String[] args) 
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		
		String query1="delete from product_master where product_id=?";
		String query2="update product_master set product_price=? where product_id=?";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm9", "root", "akshay");
			
			//DELETE QUERY
			pstmt=con.prepareStatement(query1);
			//add products into the batch
			pstmt.setInt(1, 1);
			pstmt.addBatch();
			
			pstmt.setInt(1, 3);
			pstmt.addBatch();
			
			int[] arr1=pstmt.executeBatch();
			System.out.println(arr1.length+" PRODUCTS DELETED SUCCESSFULLY");
			
			//UPDATE QUERY
			pstmt=con.prepareStatement(query2);
			pstmt.setDouble(1, 20000);
			pstmt.setInt(2, 6);
			
			pstmt.addBatch();
			
			pstmt.setDouble(1, 30000.25);
			pstmt.setInt(2, 5);
			
			pstmt.addBatch();
			
			int[] arr2=pstmt.executeBatch();
			
			System.out.println(arr2.length+" RECORDS UPDATED SUCCESSFULLY");
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
