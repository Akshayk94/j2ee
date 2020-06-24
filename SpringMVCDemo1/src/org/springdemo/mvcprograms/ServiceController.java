package org.springdemo.mvcprograms;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServiceController 
{
	//method to display user form
	@RequestMapping("/getuserform")
	public String displayForm()
	{
		return "show-form"; //secondary page
	}
	
	//method to process user form
	@RequestMapping("/userlink")
	public String processForm()
	{
		return "welcome"; //secondary page
	}
	
	//method to display student form
	@RequestMapping("/getstudentform")
	public String displayStudentForm()
	{
		return "student-form";
	}
	
	//method to add the data inside the model.
	@RequestMapping("/enrollstudent")
	public String processStudentForm(HttpServletRequest req, Model themodel)
	{
		//fetch the data from HTML Page
		String student=req.getParameter("studentname");
		String percentage=req.getParameter("percentage");
		String result;
		
		//parsing 
		
		double marks=Double.parseDouble(percentage);
		
		//check student eligible or not 
		if(marks>=60)
		{
			result=student+" YOU ARE ELIGIBLE FOR INTERVIEW";
		}
		else
		{
			result=student+" YOU ARE NOT ELIGIBLE FOR INTERVIEW";
		}
		
		//put the result inside the model
		
		themodel.addAttribute("message", result);
		
		//return view name
		return "student-confirmation";
	}
	
	//method to display customer form
	@GetMapping("/getcustomerform")
	public String displayCustomerForm()
	{
		return "customer-form";
	}
	
	//method to process customer form
	@PostMapping("/customerlink")
	public String processCustomerForm(HttpServletRequest req,Model themodel)
	{
		//fetch the data of customer form
		String name=req.getParameter("customer");
		
		String[] productlist=req.getParameterValues("products");
		
		//add values inside the model
		
		themodel.addAttribute("customername", name);
		
		themodel.addAttribute("products", productlist);
		
		//return back to customer confirmation view
		
		return "customer-confirmation";
	}
	
}
