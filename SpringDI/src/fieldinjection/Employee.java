package fieldinjection;

public class Employee 
{
	private String employeeName;
	private String employeeDesignation;
	
	public String getEmployeeName()
	{
		return employeeName;
	}
	public String getEmployeeDesignation() 
	{
		return employeeDesignation;
	}
	public void setEmployeeName(String employeeName) 
	{
		this.employeeName = employeeName;
	}
	public void setEmployeeDesignation(String employeeDesignation) 
	{
		this.employeeDesignation = employeeDesignation;
	}
}
