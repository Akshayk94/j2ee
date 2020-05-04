package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firstlink")
public class Addition extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String n1=req.getParameter("no1");
		String n2=req.getParameter("no2");
		
		double num1=Double.parseDouble(n1);
		double num2=Double.parseDouble(n2);
		
		String choice=req.getParameter("choice");
		
		if(choice.equals("add"))
		{
			PrintWriter pw=resp.getWriter();
			
			pw.print("<h1>ADDITION IS "+(num1+num2)+"</h1>");
			
		}
		else if(choice.equals("multiply"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("nextlink");
			
			rd.forward(req, resp);
		}
	}
}
