package org.springdemo.mvcprograms;

import org.springframework.stereotype.Controller;
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
	
}
