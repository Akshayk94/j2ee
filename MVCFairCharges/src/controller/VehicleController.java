package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.VehicleService;

//CONTROLLER LAYER

@WebServlet("/controllerlink")
public class VehicleController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//fetch the values from html
		String vehicletype=req.getParameter("vehicletype");
		String totalkm=req.getParameter("km");
		String totalmin=req.getParameter("minutes");
		
		//parsing
		double kilometers=Double.parseDouble(totalkm);
		int minutes=Integer.parseInt(totalmin);
		
		//call the methods from model layer
		VehicleService vs1=new VehicleService();
		double amount1=vs1.calculateFair(vehicletype, kilometers);
		int amount2=vs1.calculateWaitingCharges(minutes);
		
		req.setAttribute("fairamount", amount1);
		req.setAttribute("waitingcharge", amount2);
		
		RequestDispatcher rd=req.getRequestDispatcher("bill.jsp");
		rd.forward(req, resp);
	}
}
