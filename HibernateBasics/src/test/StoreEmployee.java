package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domain.Employee;

public class StoreEmployee 
{
	public static void main(String[] args) 
	{
		//declare hibernate resources
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		Transaction tx=null;
		
		cfg=new Configuration();
		
		cfg=cfg.configure("cfgs/hibernate.cfg.xml");
		
		factory=cfg.buildSessionFactory();
		
		ses=factory.openSession();
		
		try
		{
			Employee e1=new Employee(1,"RAHUL",25000.25);
			
			Employee e2=new Employee(2,"RAJ",35000.10);
			
			tx=ses.beginTransaction();
			
			ses.save(e1);
			ses.save(e2);
			
			tx.commit();
			
			System.out.println("EMPLOYEE DETAILS ARE INSERTED SUCCESSFULLY");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
