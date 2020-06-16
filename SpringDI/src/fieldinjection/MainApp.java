package fieldinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("fieldinjection/applicationContext.xml");
		
		Employee e1=c1.getBean("emp", Employee.class);
		
		System.out.println("EMPLOYEE NAME IS "+e1.getEmployeeName());
		
		System.out.println("EMPLOYEE DESIGNATION IS "+e1.getEmployeeDesignation());
	}
}
