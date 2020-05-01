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

@WebServlet("/searchlink")
public class SearchEmployee extends HttpServlet
{
	Connection con;
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
		
		//fetch the designation from html page
		String designation=req.getParameter("desg");
		
		//declare resources
		PrintWriter pw=resp.getWriter();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		//sql query
		String query="select employee_name,employee_salary from employee_master where employee_desg=?";
		
		try 
		{
			pstmt=con.prepareStatement(query);
			
			pstmt.setString(1, designation);
			
			rs=pstmt.executeQuery();
			pw.print("<h1>EMPLOYEE DESIGNATION IS "+designation+"</h1>");
			pw.print("<table border='2'>");
			pw.print("<tr>");
			pw.print("<th>NAME</th>");
			pw.print("<th>SALARY</th>");
			pw.print("</tr>");
			while(rs.next())
			{
				String name=rs.getString("employee_name");
				double salary=rs.getDouble("employee_salary");
				
				pw.print("<tr>");
				pw.print("<td>"+name+"</td>");
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
