package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deletelink")
public class DeleteEmployee extends HttpServlet
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
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id=req.getParameter("empid");
		
		int eid=Integer.parseInt(id);
		
		PreparedStatement pstmt=null;
		
		String query="delete from employee_master where employee_id=?";
		
		try 
		{
			pstmt=con.prepareStatement(query);
			
			pstmt.setInt(1, eid);
			
			int count=pstmt.executeUpdate();
			
			PrintWriter pw=resp.getWriter();
			
			pw.print("<h1>"+count+" EMPLOYEE DELETED SUCCESSFULLY");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
