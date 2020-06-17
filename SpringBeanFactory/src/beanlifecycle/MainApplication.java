package beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("beanlifecycle/applicationContext.xml");
		
		Master1 m1=c1.getBean("m1", Master1.class);
		m1.display();
		m1.display();
		m1.display();
		
		c1.close();
	}
}
