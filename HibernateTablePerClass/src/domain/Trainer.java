package domain;

import javax.persistence.Entity;

@Entity
public class Trainer extends Person
{
	private double salary;

	public double getSalary() 
	{
		return salary;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
}
