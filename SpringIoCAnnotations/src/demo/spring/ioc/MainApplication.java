package demo.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication 
{

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Account a1=c1.getBean("account1", Account.class);
		a1.getAccountType();
		a1.deposit(5000);
		a1.getBalance();
		
		System.out.println("********************************");
		
		Account a2=c1.getBean("loanAccount", Account.class);
		a2.getAccountType();
		a2.deposit(10000);
		a2.getBalance();
	}

}
