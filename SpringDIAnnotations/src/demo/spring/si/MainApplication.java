package demo.spring.si;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Laptop l1=c1.getBean("laptop1", Laptop.class);
		l1.getLaptopCategory();
		l1.showProcessorDetails();
		
		System.out.println("-----------------------------");
		
		Laptop l2=c1.getBean("laptop2", Laptop.class);
		l2.getLaptopCategory();
		l2.showProcessorDetails();
	}
}
