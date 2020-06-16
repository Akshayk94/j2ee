package collectiondi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("collectiondi/applicationContext.xml");
		
		Customer cust=c1.getBean("customer1", Customer.class);
	
		cust.displayOrderInfo();
		
		System.out.println("--------------------------------");
		
		cust.displayCardInfo();
		
		
	}
}
