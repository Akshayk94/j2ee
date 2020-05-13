package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoginValidation;


//CONTROLLER LAYER
@WebServlet("/loginlink")
public class LoginController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//fetch the values from html
		String user=req.getParameter("username");
		String password=req.getParameter("password");
		
		//call the method from model layer
		LoginValidation m1=new LoginValidation();
		
		boolean b=m1.validate(user, password);
		
		if(b==true)
		{
			resp.sendRedirect("welcome.jsp");
		}
		else
		{
			resp.sendRedirect("index.html");
		}
		
	}
}
