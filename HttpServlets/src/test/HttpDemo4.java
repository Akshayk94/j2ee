package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpDemo4 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//fetch the values from html page
		String[] coursenames=req.getParameterValues("courses");
	
		//print selected courses
		
		PrintWriter pw=resp.getWriter();
		
		pw.print("<h1 style='color:red'>SELECTED COURSES ARE:</h1>");
		
		for(int i=0;i<coursenames.length;i++)
		{
			pw.print("<h1 style='color:green'>"+coursenames[i]+"</h1>");
		}
	}
}
