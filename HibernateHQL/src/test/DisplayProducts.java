package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import domain.Product;

public class DisplayProducts 
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
		
		//display multiple objects by using HQL
		
		//String query="select * from product_master"
		
		Query q=ses.createQuery("select p from Product p");
		
		List<Product> products=q.list();
		
		for(Product p:products)
		{
			System.out.println(p);
		}
	}
}
