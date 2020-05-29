package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domain.AuthorDetails;
import domain.BookDetails;

public class SaveBookAuthorDetails
{
	public static void main(String[] args) 
	{
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		Transaction tx=null;
		
		cfg=new Configuration();
		cfg=cfg.configure("cfgs/hibernate.cfg.xml");
		cfg=cfg.addAnnotatedClass(BookDetails.class);
		cfg=cfg.addAnnotatedClass(AuthorDetails.class);
		
		factory=cfg.buildSessionFactory();
		
		ses=factory.openSession();
		
		//LOAD THE OBJECT OF BOOK FROM BOOK MASTER CLASS
		BookDetails book1=ses.load(BookDetails.class, 1);
		
		//CREATE OBJECTS FRO AUTHOR CLASS
		
		
		AuthorDetails author1=new AuthorDetails();
		author1.setAuthorName("JAMES");
		
		AuthorDetails author2=new AuthorDetails();
		author2.setAuthorName("MAXMILLAN");
		
		//ADD AUTHORS FOR RESPECTIVE BOOK
		book1.addAuthors(author1);
		//book1.addAuthors(author2);
		
		//START THE TRANSACTION
		tx=ses.beginTransaction();
		
		ses.save(author1);
		ses.save(author2);
		
		tx.commit();
		
		System.out.println("DETAILS INSERTED SUCCESSFULLY");
		
	}
}
