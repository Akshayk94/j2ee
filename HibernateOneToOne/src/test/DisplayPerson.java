package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import domain.Passport;
import domain.Person;

public class DisplayPerson 
{
	public static void main(String[] args) 
	{
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		
		cfg=new Configuration();
		cfg=cfg.configure("cfgs/hibernate.cfg.xml");
		cfg=cfg.addAnnotatedClass(Passport.class);
		cfg=cfg.addAnnotatedClass(Person.class);
		
		factory=cfg.buildSessionFactory();
		
		ses=factory.openSession();
		
		Person p1=ses.load(Person.class, 1);
		
		System.out.println(p1.getPersonId());
		System.out.println(p1.getPersonName());
		System.out.println(p1.getPersonAge());
		System.out.println(p1.getPassportRef().getPassportNumber());
		System.out.println(p1.getPassportRef().getCountryName());
	}
}
