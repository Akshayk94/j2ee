package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domain.Product;

public class StoreProduct
{
	public static void main(String[] args)
	{
		//STEP-1 DECLARE HIBERNATE RESOURCES
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		Transaction tx=null;
		
		//STEP-2 ACTIVATE HIBERNATE FRAMEWORK
		cfg=new Configuration();
		
		//STEP-3 READ THE DATA FROM CFG AND MAPPING FILES
		cfg=cfg.configure("cfgs/hibernate.cfg.xml");
		
		//STEP-4 ESTABLISH THE CONNECTION WITH DB VENDOR
		factory=cfg.buildSessionFactory();
		
		//STEP-5 OPEN THE SESSION WITH DATABASE VENDOR
		ses=factory.openSession();
		
		//STEP-6 CREATE AN OBJECT OF DOMAIN CLASS
		Product p1=new Product();
		
		//STEP-7 SET THE VALUES FOR DATA MEMBERS
		p1.setProductId(1);
		p1.setProductName("MASK");
		p1.setProductQty(10000);
		p1.setProductPrice(500.25);
		p1.setProductCategory("HEALTHCARE");
		
		//STEP-8 START THE TRANSACTION
		tx=ses.beginTransaction();
		
		ses.save(p1);
		
		tx.commit();
		
		System.out.println("PRODUCT INSERTED SUCCESSFULLY");

	}
}
