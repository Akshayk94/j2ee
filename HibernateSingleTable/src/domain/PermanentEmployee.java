package domain;

import javax.persistence.*;

@Entity
@Table(name="employee_details")
@DiscriminatorValue("P")
public class PermanentEmployee extends Employee
{
	@Column(name="designation")
	private String designation;

	public String getDesignation() 
	{
		return designation;
	}

	public void setDesignation(String designation) 
	{
		this.designation = designation;
	}
	
}
