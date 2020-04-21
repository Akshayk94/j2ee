package test;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MetaDataDemo2 
{

	public static void main(String[] args) 
	{
		Connection con=null;
		FileWriter fw=null;
		Properties prop=new Properties();
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm9","root","akshay");

			//TO GET THE REF OF DATABASE METADATA
			DatabaseMetaData dmeta=con.getMetaData();
			
			String databasename=dmeta.getDatabaseProductName();
			String databaseversion=dmeta.getDatabaseProductVersion();
			
			//LOCATE THE PROPERTIES FILE
			fw=new FileWriter("G:\\PEJM9data\\database.properties");
			
			//ADD META DATA INTO THE PROPERTIES FILE
			prop.setProperty("database", databasename);
			prop.setProperty("version", databaseversion);
			
			//SAVE PROPERTIES FILE
			prop.store(fw, "META DATA FILE");
			
			System.out.println("PROPERTIES FILE CREATED SUCCESSFULLY");
		} 
		catch (ClassNotFoundException | SQLException | IOException e) 
		{
			e.printStackTrace();
		}
		

	}

}
