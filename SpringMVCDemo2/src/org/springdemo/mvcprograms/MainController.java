package org.springdemo.mvcprograms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController 
{
	//create a controller method
		@RequestMapping("/")
		public String showHomePage()
		{
			return "main-menu"; //return view name (JSP file name)
		}	
}
