package org.springdemo.mvcprograms;

//MODEL CLASS 
public class Student 
{
	private String studentName;
	private double studentPercentage;
	private String studentStream;
	private String country;
	private String gender;
	private String[] courses;
	
	
	public String getStudentName() 
	{
		return studentName;
	}
	public double getStudentPercentage() 
	{
		return studentPercentage;
	}
	public String getStudentStream()
	{
		return studentStream;
	}
	public String getCountry() 
	{
		return country;
	}
	public String getGender() 
	{
		return gender;
	}
	public String[] getCourses() 
	{
		return courses;
	}
	public void setStudentName(String studentName) 
	{
		this.studentName = studentName;
	}
	public void setStudentPercentage(double studentPercentage) 
	{
		this.studentPercentage = studentPercentage;
	}
	public void setStudentStream(String studentStream)
	{
		this.studentStream = studentStream;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public void setCourses(String[] courses) 
	{
		this.courses = courses;
	}
	
}
