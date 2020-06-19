package demo.spring.scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication 
{

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Master1 master1=c1.getBean("m1", Master1.class);
		master1.test();
		
		Master1 master2=c1.getBean("m1", Master1.class);
		master2.test();
		
		System.out.println(master1==master2);
		
		System.out.println("-------------------------------");
		
		Master2 master3=c1.getBean("m2", Master2.class);
		master3.display();
		
		Master2 master4=c1.getBean("m2", Master2.class);
		master4.display();
		
		System.out.println(master3==master4);
	
	}

}
