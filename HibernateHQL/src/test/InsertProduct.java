package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domain.Product;

public class InsertProduct 
{

	public static void main(String[] args)
	{
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		Transaction tx=null;
		
		cfg=new Configuration();
		
		cfg=cfg.configure("cfgs/hibernate.cfg.xml");
		cfg=cfg.addAnnotatedClass(Product.class);
		
		factory=cfg.buildSessionFactory();
		
		ses=factory.openSession();
		
		Product p1=new Product();
		p1.setProductId(2);
		p1.setProductName("MOBILE");
		p1.setProductQty(150);
		p1.setProductPrice(15000.25);
		p1.setProductCategory("GADGETS");
		
		tx=ses.beginTransaction();
		
		ses.save(p1);
		
		tx.commit();
		
		System.out.println("PRODUCT INSERTED SUCCESSFULLY");
		
	}

}
