package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domain.Product;

public class UpdateProduct 
{

	public static void main(String[] args) 
	{
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		Transaction tx=null;
		
		cfg=new Configuration();
		
		cfg=cfg.configure("cfgs/hibernate.cfg.xml");
		
		factory=cfg.buildSessionFactory();
		
		ses=factory.openSession();
		
		Product p1=ses.load(Product.class, 1);
		p1.setProductPrice(1400.25);
		
		tx=ses.beginTransaction();
		
		ses.update(p1);
		
		tx.commit();
		
		System.out.println("PRODUCT UPDATED SUCCESSFULLY");

	}

}
