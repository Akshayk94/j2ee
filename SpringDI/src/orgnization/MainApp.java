package orgnization;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{

	public static void main(String[] args) 
	{
		//Activate the Spring framework
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("orgnization/applicationContext.xml");

		//call the get bean method to get object ref
		Company c1=context.getBean("company1",Company.class);
		
		String type1=c1.getcompanyType();
		System.out.println("COMPANY TYPE IS "+type1);
		
		c1.getEmployees();
		
		System.out.println("*******************************");
		
		Company c2=context.getBean("company2",Company.class);
	
		String type2=c2.getcompanyType();
		System.out.println("COMPANY TYPE IS "+type2);
		
		c2.getEmployees();
	}

}
