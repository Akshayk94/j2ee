package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import domain.Vehicle;

public class MainApp2
{
	public static void main(String[] args) 
	{
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		
		cfg=new Configuration();
		cfg=cfg.configure("cfgs/hibernate.cfg.xml");
		cfg=cfg.addAnnotatedClass(Vehicle.class);
		
		factory=cfg.buildSessionFactory();
		
		ses=factory.openSession();
		
		//write a criteria to fetch first 3 records
		Criteria crt1=ses.createCriteria(Vehicle.class);
		
		crt1.setMaxResults(3);
		
		List<Vehicle> vehicles1=crt1.list();
		
		
		
		for(Vehicle v:vehicles1)
		{
			System.out.println(v);
		}
		
		System.out.println("**************************************");
		
		//write criteria to exclude first 2 records
		
		Criteria crt2=ses.createCriteria(Vehicle.class);
		
		crt2.setFirstResult(2);
		
		List<Vehicle> vehicles2=crt2.list();
		
		
		for(Vehicle v:vehicles2)
		{
			System.out.println(v);
		}	
		
		System.out.println("**************************************");

		//write a criteria to fetch all the vehicles having price >70000
		
		Criteria crt3=ses.createCriteria(Vehicle.class);
		
		crt3.add(Restrictions.gt("vehiclePrice", 70000.00));
		
		List<Vehicle> vehicles3=crt3.list();
		
		for(Vehicle v:vehicles3)
		{
			System.out.println(v);
		}
		
		System.out.println("**************************************");

		
		//write a criteria to display all the vehicles whose brand name is honda
		
		Criteria crt4=ses.createCriteria(Vehicle.class);
		
		crt4.add(Restrictions.like("vehicleBrand", "HONDA"));
		
		List<Vehicle> vehicles4=crt4.list();
		
		for(Vehicle v:vehicles4)
		{
			System.out.println(v);
		}
		
		System.out.println("**************************************");

		//write a criteria to display all vehicles in asc order according to price
		
		Criteria crt5=ses.createCriteria(Vehicle.class);
		
		crt5.addOrder(Order.desc("vehiclePrice"));
		
		List<Vehicle> vehicles5=crt5.list();
		
		for(Vehicle v:vehicles5)
		{
			System.out.println(v);
		}
		
	}
}
