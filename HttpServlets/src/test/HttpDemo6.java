package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpDemo6 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//fetch the values
		String qty=req.getParameter("qty");
		String price=req.getParameter("price");
		String choice=req.getParameter("category");
		double billamt=0.0;
		
		//parsing
		int qty1=Integer.parseInt(qty);
		double price1=Double.parseDouble(price);
		
		switch(choice)
		{
			case "electronics":billamt=qty1*price1;
							   billamt=billamt+billamt*0.05;
							   break;
							   
			case "gadgets":billamt=qty1*price1;
						   billamt=billamt+billamt*0.1;
						   break;
		}
		
		PrintWriter pw=resp.getWriter();
		pw.print("<h1 style='color:red'>FINAL BILL AMT IS "+billamt+"</h1>");
	}
}
