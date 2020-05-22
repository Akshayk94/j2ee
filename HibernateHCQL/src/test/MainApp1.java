package test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import domain.Vehicle;

public class MainApp1 
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
		
		//display all the objects from database table
		Criteria crt1=ses.createCriteria(Vehicle.class);
		List<Vehicle> vehicles=crt1.list();
		System.out.println("ID\tNAME\tPRICE\tBRAND");
		System.out.println("--------------------------------------");
		for(Vehicle v:vehicles)
		{
			System.out.println(v.getVehicleId()+"\t"+v.getVehicleName()+"\t"+v.getVehiclePrice()+"\t"+v.getVehicleBrand());
		}
		
		
		System.out.println("***********************************************************");
		
		
		//display data from a specific column
		Criteria crt2=ses.createCriteria(Vehicle.class);
		crt2.setProjection(Projections.property("vehicleName"));
		
		List<String> vechilenames=crt2.list();
		System.out.println("VEHICLE NAME");
		System.out.println("-------------------");
		for(String s: vechilenames)
		{
			System.out.println(s);
		}
		System.out.println("***********************************************************");
		
		
		//display data from two or more columns
		Criteria crt3=ses.createCriteria(Vehicle.class);
		
		ProjectionList p1=Projections.projectionList();
		p1.add(Projections.property("vehicleName"));
		p1.add(Projections.property("vehiclePrice"));
		
		crt3.setProjection(p1);
		
		List vehicledata=crt3.list();
		
		Iterator itr=vehicledata.iterator();
		System.out.println("NAME\tPRICE");
		while(itr.hasNext())
		{
			Object[] arr1=(Object[]) itr.next();
							  //NAME          PRICE
			System.out.println(arr1[0]+"\t"+arr1[1]);
		}
	}
}
