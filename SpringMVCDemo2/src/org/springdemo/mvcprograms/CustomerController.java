package org.springdemo.mvcprograms;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController 
{
	@InitBinder  //custom init method for trimming
	public void initbinder(WebDataBinder databinder)
	{
		StringTrimmerEditor trimmer=new StringTrimmerEditor(true);
		
		databinder.registerCustomEditor(String.class, trimmer);
	}
	
	@RequestMapping("/getcustomerform")
	public String getCustomerForm(Model themodel)
	{
		//create object of model class
		Customer cust=new Customer();
		
		//add object into the model attribute.
		themodel.addAttribute("custref", cust );
		
		return "customer-form";
	}
	
	@RequestMapping("/processcustomer")
	public String processCustomerForm(@Valid@ModelAttribute("custref") Customer theCustomer
									, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "customer-form";
		}
		else
		{
			return "customer-confirmation";
		}
	}
}
