package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import domain.Employee;

public class DisplayEmployee 
{
	public static void main(String[] args) 
	{
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		
		cfg=new Configuration();
		
		cfg=cfg.configure("cfgs/hibernate.cfg.xml");
		
		factory=cfg.buildSessionFactory();
		
		ses=factory.openSession();
		
		Employee e1=ses.load(Employee.class, 1);
		
		System.out.println(e1.getEmployeeId()+"\t"+e1.getEmployeeName()+"\t"+e1.getEmployeeSalary());
	}
}
