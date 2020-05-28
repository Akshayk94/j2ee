package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domain.*;



public class SaveCountryDetails 
{

	public static void main(String[] args) 
	{
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		Transaction tx=null;
		
		cfg=new Configuration();
		
		cfg=cfg.configure("cfgs/hibernate.cfg.xml");
		cfg=cfg.addAnnotatedClass(City.class);
		cfg=cfg.addAnnotatedClass(CountryDetails.class);
		
		factory=cfg.buildSessionFactory();
		
		ses=factory.openSession();
		
		//load the country from database table
		
		CountryDetails c1=ses.load(CountryDetails.class, 1);
		
		//create objects of city class
		City ct1=new City();
		ct1.setCityName("DELHI");
		
		City ct2=new City();
		ct2.setCityName("PUNE");
		
		//add cities into the country
		c1.addCities(ct1);
		c1.addCities(ct2);
		
		tx=ses.beginTransaction();
		
		ses.save(ct1);
		ses.save(ct2);
		
		tx.commit();
		
		System.out.println("DEATILS STORED SUCCESSFULLY");
		
		

	}

}
