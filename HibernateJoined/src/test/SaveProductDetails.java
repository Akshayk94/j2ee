package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domain.Book;
import domain.Laptop;
import domain.Product;

public class SaveProductDetails 
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
		cfg=cfg.addAnnotatedClass(Book.class);
		cfg=cfg.addAnnotatedClass(Laptop.class);
		
		factory=cfg.buildSessionFactory();
		
		ses=factory.openSession();
		
		Book b1=new Book();
		b1.setProductName("BOOK");
		b1.setBookAuthor("JAMES");
		
		Laptop l1=new Laptop();
		l1.setProductName("LAPTOP");
		l1.setLaptopBrand("APPLE");
		
		tx=ses.beginTransaction();
		ses.save(b1);
		ses.save(l1);
		
		tx.commit();
		
		System.out.println("PRODUCT DETAILS STORED SUCCESSFULLY");
	}
}
