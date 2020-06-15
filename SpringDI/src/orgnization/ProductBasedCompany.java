package orgnization;

public class ProductBasedCompany implements Company 
{
	//dependency declaration
	private Employee employeeRef;

	@Override
	public String getcompanyType() 
	{
		return "PRODUCT BASED COMPANY";
	}
	
	//setter injection
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
