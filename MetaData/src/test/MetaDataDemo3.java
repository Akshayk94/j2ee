package test;

import java.sql.*;

public class MetaDataDemo3 
{

	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String query="select * from product_master";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm9","root","akshay");

			stmt=con.createStatement();
			
			rs=stmt.executeQuery(query);
			
			ResultSetMetaData rsmeta=rs.getMetaData();
			
			System.out.println(rsmeta.getColumnLabel(2));
			System.out.println(rsmeta.getColumnCount());
			System.out.println(rsmeta.getColumnTypeName(3));
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
