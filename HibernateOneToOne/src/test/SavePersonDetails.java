package test;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domain.Passport;
import domain.Person;

public class SavePersonDetails 
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("ENTER PERSON NAME");
		String personname=sc1.next();
		
		System.out.println("ENTER PERSON AGE");
		int age=sc1.nextInt();
		
		System.out.println("ENTER PASSPORT NUMBER");
		String passportno=sc1.next();
		
		System.out.println("ENTER COUNTRY NAME");
		String country=sc1.next();
		
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		Transaction tx=null;
		
		cfg=new Configuration();
		cfg=cfg.configure("cfgs/hibernate.cfg.xml");
		cfg=cfg.addAnnotatedClass(Passport.class);
		cfg=cfg.addAnnotatedClass(Person.class);
		
		factory=cfg.buildSessionFactory();
		
		ses=factory.openSession();
		
		//create object of passport class
		Passport ps=new Passport();
		ps.setPassportNumber(passportno);
		ps.setCountryName(country);
		
		//create object of person class
		Person per=new Person();
		per.setPersonName(personname);
		per.setPersonAge(age);
		
		//link passport object with person object
		per.setPassportRef(ps);
		
		tx=ses.beginTransaction();
		
		ses.save(per);
		
		tx.commit();
		
		System.out.println("PERSON DETAILS INSERTED SUCCESSFULLY");
	}
}
