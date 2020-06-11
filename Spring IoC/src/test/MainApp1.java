package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 
{

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("test/applicationContext.xml");
		
		//Master1 m1=new Master1()
		Master1 m=c1.getBean(Master1.class,"m1");
		m.display();
	}

}
