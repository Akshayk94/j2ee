package banking;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{

	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("ENTER ACCOUNT NUMBER");
		int accno=sc1.nextInt();
		
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("banking/applicationContext.xml");

		Atm a1=context.getBean("atmentity",Atm.class);
		
		a1.printBalanceInformation(accno);
			
	}

}
