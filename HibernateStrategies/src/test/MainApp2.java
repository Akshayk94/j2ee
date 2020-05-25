package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domain.Student2;

public class MainApp2
{
	public static void main(String[] args) 
	{
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		Transaction tx=null;
		
		cfg=new Configuration();
		
		cfg=cfg.configure("cfgs/hibernate.cfg.xml");
		
		cfg=cfg.addAnnotatedClass(Student2.class);
		
		factory=cfg.buildSessionFactory();
		
		ses=factory.openSession();
		
		Student2 s=new Student2();
		s.setStudentName("ROHIT");
		s.setStudentPercentage(45.25);
		
		tx=ses.beginTransaction();
		
		ses.save(s);
		
		tx.commit();
		
		System.out.println("STUDENT INSERTED SUCCESSFULLY");
	}
}
