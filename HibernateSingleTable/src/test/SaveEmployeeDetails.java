package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domain.ContractEmployee;
import domain.Employee;
import domain.PermanentEmployee;

public class SaveEmployeeDetails 
{
	public static void main(String[] args) 
	{
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		Transaction tx=null;
		
		cfg=new Configuration();
		cfg=cfg.configure("cfgs/hibernate.cfg.xml");
		cfg=cfg.addAnnotatedClass(Employee.class);
		cfg=cfg.addAnnotatedClass(ContractEmployee.class);
		cfg=cfg.addAnnotatedClass(PermanentEmployee.class);
		
		factory=cfg.buildSessionFactory();
		
		ses=factory.openSession();
		
		ContractEmployee c1=new ContractEmployee();
		c1.setEmployeeName("ROHIT");
		c1.setEmployeeAge(25);
		c1.setWorkingDays(250);
		
		PermanentEmployee p1=new PermanentEmployee();
		p1.setEmployeeName("ASHWIN");
		p1.setEmployeeAge(26);
		p1.setDesignation("DEVELOPER");
		
		tx=ses.beginTransaction();
		
		ses.save(c1);
		ses.save(p1);
		
		tx.commit();
		
		System.out.println("EMPLOYEE DETAILS INSERTED SUCCESSFULLY");
	}
}
