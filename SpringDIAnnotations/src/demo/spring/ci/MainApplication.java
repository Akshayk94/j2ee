package demo.spring.ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication 
{

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Vehicle v1=c1.getBean("bike", Vehicle.class);
		v1.getVehicleType();
		v1.getEngineType();
		
		System.out.println("----------------------------");
		
		Vehicle v2=c1.getBean("car", Vehicle.class);
		v2.getVehicleType();
		v2.getEngineType();
		
	}

}
