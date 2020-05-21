package test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import domain.Product;

public class Displayproducts1 
{

	public static void main(String[] args) 
	{
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		
		cfg=new Configuration();
		
		cfg=cfg.configure("cfgs/hibernate.cfg.xml");
		cfg=cfg.addAnnotatedClass(Product.class);
		
		factory=cfg.buildSessionFactory();
		
		ses=factory.openSession();
		
		//display all the product names
		
		Query q1=ses.createQuery("select p.productName from Product p");
		List<String> productnames1=q1.list();
		
		for(String s:productnames1)
		{
			System.out.println(s);
		}
		
		System.out.println("*********************");
		
		//display price of all the products
		Query q2=ses.createQuery("select p.productPrice from Product p");
		List<Double> productprice1=q2.list();
		
		for(Double s:productprice1)
		{
			System.out.println(s);
		}
		
	}

}
