package beanlifecycle;

public class Master1 
{
	//custom init method
	void startUpCode()  
	{
		System.out.println("START UP CODE EXECUTION");
	}
	
	void display()
	{
		System.out.println("DISPLAY METHOD OF CLASS");
	}
	
	//custom destroy method
	void shutDownCode()
	{
		System.out.println("SHUT DOWN CODE EXECUTION");
	}
}
