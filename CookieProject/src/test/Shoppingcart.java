package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cartlink")
public class Shoppingcart extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//fetch the values
		String productname=req.getParameter("pname");
		String productprice=req.getParameter("price");
		String add=req.getParameter("add");
		String show=req.getParameter("show");
		
		if(add!=null)
		{
			//add cookie 
			Cookie c1=new Cookie(productname,productprice);
			resp.addCookie(c1);
			resp.sendRedirect("index.html");
		}
		else if(show!=null)
		{
			//show cookie
			Cookie[] carray=req.getCookies();
			
			PrintWriter pw=resp.getWriter();
			
			for(int i=0;i<carray.length;i++)
			{
				pw.print("<h1>"+carray[i].getName()+":"+carray[i].getValue()+"</h1>");
			}
		}
	}
}
