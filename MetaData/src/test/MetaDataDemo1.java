package test;

import java.sql.*;

public class MetaDataDemo1
{

	public static void main(String[] args) 
	{
		Connection con=null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm9","root","akshay");
		
			DatabaseMetaData dmeta=con.getMetaData();
			
			//META DATA
			System.out.println(dmeta.getDatabaseProductName());
			System.out.println(dmeta.getDatabaseProductVersion());
			System.out.println(dmeta.getDriverName());
			System.out.println(dmeta.getDriverVersion());
			System.out.println(dmeta.getURL());
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
