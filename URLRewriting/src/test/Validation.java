package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginlink")
public class Validation extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		if(username.equals("admin") && password.equals("deccan"))
		{
			resp.sendRedirect("welcomelink?user="+username);
		}
		else
		{
			resp.sendRedirect("index.html");
		}
	}
}
