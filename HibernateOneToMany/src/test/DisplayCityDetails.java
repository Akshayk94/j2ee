package test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import domain.City;
import domain.CountryDetails;

//display list of all the cities related with specific country
public class DisplayCityDetails 
{
	public static void main(String[] args) 
	{
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		
		cfg=new Configuration();
		cfg=cfg.configure("cfgs/hibernate.cfg.xml");
		cfg=cfg.addAnnotatedClass(CountryDetails.class);
		cfg=cfg.addAnnotatedClass(City.class);
		
		factory=cfg.buildSessionFactory();
		
		ses=factory.openSession();
		
		//load the country object from database table
		CountryDetails c1=ses.load(CountryDetails.class, 3);
		
		System.out.println("COUNTRY NAME IS "+c1.getCountryName());
		
		List<City> citynames=c1.getCityref();
		
		System.out.println("-------------------------------");
		System.out.println("LIST OF CITIES");
		for(City c:citynames)
		{
			System.out.println(c.getCityName());
		}
	}
}
