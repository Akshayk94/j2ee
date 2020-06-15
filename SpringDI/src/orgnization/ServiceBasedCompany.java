package orgnization;

public class ServiceBasedCompany implements Company
{
	//dependency declaration
	private Employee employeeRef;
	
	@Override
	public String getcompanyType() 
	{
		return "SERVICE BASED COMPANY";
	}
	
	//inject the dependency
	public void setEmployeeRef(Employee employeeRef) 
	{
		this.employeeRef = employeeRef;
	}

	
	//add dependency properties
	@Override
	public void getEmployees() 
	{
		employeeRef.getEmployeeType();
	}
}
