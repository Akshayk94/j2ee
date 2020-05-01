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

@WebServlet("/displaylink")
public class DisplayEmployee extends HttpServlet
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
		
		PrintWriter pw=resp.getWriter();
		Statement stmt=null;
		ResultSet rs=null;
		
		String query="select * from employee_master";
		
		try 
		{
			stmt=con.createStatement();
			
			rs=stmt.executeQuery(query);
			
			pw.print("<table border='2'>");
			pw.print("<tr>");
			pw.print("<th>EMPLOYEE ID</th>");
			pw.print("<th>EMPLOYEE NAME</th>");
			pw.print("<th>EMPLOYEE DESGINATION</th>");
			pw.print("<th>EMPLOYEE SALARY</th>");
			pw.print("</tr>");
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String desg=rs.getString(3);
				double salary=rs.getDouble(4);
				
				pw.print("<tr>");
				pw.print("<td>"+id+"</td>");
				pw.print("<td>"+name+"</td>");
				pw.print("<td>"+desg+"</td>");
				pw.print("<td>"+salary+"</td>");
				pw.print("</tr>");
			}
			pw.print("</table>");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
