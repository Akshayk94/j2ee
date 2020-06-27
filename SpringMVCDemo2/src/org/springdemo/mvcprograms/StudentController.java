package org.springdemo.mvcprograms;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentController 
{
	@RequestMapping("/getregistrationform")
	public String getStudentForm(Model themodel) 
	{
		//create object of student
		Student s1=new Student();

		
		//add object inside the model
		themodel.addAttribute("stud",s1);
		return "student-form";
	}
	
	@RequestMapping("/processform")
	public String processStudentForm(@ModelAttribute("stud") Student thestudent)
	{
		return "student-confirmation";
	}
}
