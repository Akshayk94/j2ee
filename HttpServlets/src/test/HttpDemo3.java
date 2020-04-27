package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpDemo3 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String no1=req.getParameter("number1");
		String no2=req.getParameter("number2");
		
		double d1=Double.parseDouble(no1);
		double d2=Double.parseDouble(no2);
		
		PrintWriter pw=resp.getWriter();
		
		pw.print("<h1>ADDITION IS "+(d1+d2)+"</h1>");
	}
}
