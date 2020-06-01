package domain;

import javax.persistence.Entity;

@Entity
public class Student extends Person
{
	private String courseName;

	public String getCourseName() 
	{
		return courseName;
	}

	public void setCourseName(String courseName) 
	{
		this.courseName = courseName;
	}
	
	
}
