package scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication 
{
	public static void main(String[] args) 
	{
		//activate spring framework
		
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("scopes/applicationContext.xml");
	
		GoogleAccount g1=c1.getBean("account1", GoogleAccount.class);
		g1.acceptApplicationType("GMAIL");
		g1.showType();
		
		GoogleAccount g2=c1.getBean("account1", GoogleAccount.class);
		g2.acceptApplicationType("DRIVE");
		g2.showType();
		
		System.out.println(g1+"\t"+g2);
		System.out.println(g1==g2);
		
		System.out.println("*****************************");
		
		Facebook f1=c1.getBean("account2", Facebook.class);
		f1.acceptUsername("Rohit");
		f1.displayProfile();
		
		Facebook f2=c1.getBean("account2", Facebook.class);
		f2.acceptUsername("Suresh");
		f2.displayProfile();
		
		System.out.println(f1+"\t"+f2);
		System.out.println(f1==f2);
		
	}
}
