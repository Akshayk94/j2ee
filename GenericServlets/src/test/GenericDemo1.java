package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericDemo1 extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
	{
		PrintWriter pw=resp.getWriter();
		
		pw.print("<h1>THIS IS THE RESPONSE FROM GENERIC SERVLET</h1>");
	}
	
}
