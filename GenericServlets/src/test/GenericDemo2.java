package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericDemo2 extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		Date d1=new Date();
		
		PrintWriter pw=resp.getWriter();
		
		pw.print("<h1 style='color:red'>"+d1+"</h1>");
	}

}
