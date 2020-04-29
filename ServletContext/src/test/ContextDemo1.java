package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contextlink1")
public class ContextDemo1 extends HttpServlet
{
	String coursename;
	String branchname;
	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletContext context=config.getServletContext();
		coursename=context.getInitParameter("course");
		branchname=context.getInitParameter("branch");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		pw.print("<h1>COURSENAME IS "+coursename+"</h1>");
		pw.print("<h1>BRANCH NAME IS "+branchname+"</h1>");
	}
}
