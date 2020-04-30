package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registerlink")
public class EmployeeRegistration extends HttpServlet
{
	Connection con;
	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		ServletContext context=config.getServletContext();
		String driver=context.getInitParameter("driver");
		String url=context.getInitParameter("url");
		String user=context.getInitParameter("user");
		String password=context.getInitParameter("password");
		
		try 
		{
			//step-1 load and register driver
			Class.forName(driver);
			
			//step-2 establish the connection
			
			con=DriverManager.getConnection(url, user, password);
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//fetch the values from html
		String employeeName=req.getParameter("empname");
		String employeeDesignation=req.getParameter("empdesg");
		String employeeSalary=req.getParameter("empsalary");
		
		//parsing
		double salary=Double.parseDouble(employeeSalary);
		
		PreparedStatement pstmt=null;
		
		String query="insert into employee_master values(?,?,?,?)";
		
		try
		{
			//create platform
			pstmt=con.prepareStatement(query);
			//set the values for placeholders
			pstmt.setInt(1, 0);
			pstmt.setString(2, employeeName);
			pstmt.setString(3, employeeDesignation);
			pstmt.setDouble(4, salary);
			
			//execute sql query
			int count=pstmt.executeUpdate();
			
			PrintWriter pw=resp.getWriter();
			
			pw.print("<h1 style='color:green'>"+count+" EMPLOYEE REGISTERED SUCCESSFULLY");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
}
