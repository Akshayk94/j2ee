package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpDemo5 extends HttpServlet
{	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//fetch the values from html page
		String n1=req.getParameter("no1");
		String n2=req.getParameter("no2");
		String choice=req.getParameter("arithmatic");
		double result=0.0;
		
		//parsing
		double d1=Double.parseDouble(n1);
		double d2=Double.parseDouble(n2);
		
		//check condition
		if(choice.equals("add"))
		{
			result=d1+d2;
		}
		else if(choice.equals("substract"))
		{
			result=d1-d2;
		}
		
		//print result
		PrintWriter pw=resp.getWriter();
		
		pw.print("<h1>RESULT IS "+result+"</h1>");
	}
}
