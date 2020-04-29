package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigDemo1 extends HttpServlet
{
	String cityname;
	String countryname;
	
	//INITILIZATION
	@Override  //call by reference
	public void init(ServletConfig config) throws ServletException {
		
		cityname=config.getInitParameter("city");
		countryname=config.getInitParameter("country");
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		pw.print("<h1>CITY NAME IS "+cityname+"</h1>");
		pw.print("<h1>COUNTRY NAME IS "+countryname+"</h1>");
	}
}
