package sportioc;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SportSimulator //utilization layer
{

	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("SELECT SPORT TYPE");
		
		System.out.println("1: HOCKEY");
		System.out.println("2: FOOTBALL");
		int choice=sc1.nextInt();
		
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("sportioc/applicationContext.xml");

		Sport s=null;
		
		switch(choice)
		{
		case 1:s=c1.getBean("sport1", Sport.class);
				break;
				
		case 2:s=c1.getBean("sport2", Sport.class);
				break;
		}
		
		s.getSportType();
	}
	
	

}
