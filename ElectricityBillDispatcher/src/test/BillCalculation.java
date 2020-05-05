package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/nextlink")
public class BillCalculation extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//fetch the values from html
		String current=req.getParameter("current");
		String previous=req.getParameter("previous");
		String type=req.getParameter("customertype");
		PrintWriter pw=resp.getWriter();
		
		//parsing
		int currentreading=Integer.parseInt(current);
		int previousreading=Integer.parseInt(previous);
		
		//calculate total reading
		int totalReading=currentreading-previousreading;
		
		//get the values from attribute
		double resunit=(double) req.getAttribute("unit1");
		double commercialunit=(double) req.getAttribute("unit2");
		
		pw.print("<h1>ELECTRICITY BILL DETAILS</h1>");
		
		pw.print("<h2>CURRENT READING "+currentreading+"</h2>");
		
		pw.print("<h2>PREVIOUS READING "+previousreading+"</h2>");
		
		if(type.equals("resdential"))
		{
			double totalAmount=totalReading*resunit;
			
			pw.print("<h2>FINAL BILL AMOUNT IS "+totalAmount+"</h1>");
		}
		else if(type.equals("commercial"))
		{
			double totalaAmount=totalReading*commercialunit;
			
			pw.print("<h2>FINAL BILL AMOUNT IS "+totalaAmount+"</h1>");
		}
	}
}
