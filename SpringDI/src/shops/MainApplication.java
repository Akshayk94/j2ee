package shops;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//UTILIZATION
public class MainApplication 
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("shops/applicationContext.xml");

		//COMPUTER SHOP OBJECT
		Shop s1=context.getBean("shop1",Shop.class);
		s1.getShopType();
		s1.getProducts();
		
		System.out.println("*********************************");
		
		//ELECTRONICS SHOP OBJECT
		Shop s2=context.getBean("shop2",Shop.class);
		s2.getShopType();
		s2.getProducts();
	}
}
