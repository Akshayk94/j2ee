package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/profilelink")
public class Profile extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//use an existing session
		HttpSession ses=req.getSession(false);
		PrintWriter pw=resp.getWriter();
		if(ses!=null)//session is already created
		{
			//fetch the data from existing session
			String user=(String) ses.getAttribute("enduser");
			
			pw.print("<h1>LOGIN SUCCESSFUL</h1>");
			pw.print("<h2>WELCOME "+user+"</h2>");
		}
		else
		{
			//session is not created
			resp.sendRedirect("index.html");
		}
		
		pw.print("<a href='logoutlink'><button>LOGOUT</button></a>");
	}
}
