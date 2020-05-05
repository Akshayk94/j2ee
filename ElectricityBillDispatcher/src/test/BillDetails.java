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
public class BillDetails extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		double resdentialUnit=4.58;
		double commercialUnit=10.25;
		
		PrintWriter pw=resp.getWriter();
		
		req.setAttribute("unit1", resdentialUnit);
		req.setAttribute("unit2", commercialUnit);
		
		RequestDispatcher rd=req.getRequestDispatcher("nextlink");
		rd.include(req, resp);
		
		pw.print("<h4 style='color:red'>PLEASE PAY YOUR BILL BEFORE DUE DATE</h4>");
	}
}
