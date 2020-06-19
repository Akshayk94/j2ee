package demo.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication 
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BeanLifeCycle b1=c1.getBean("sample", BeanLifeCycle.class);
		b1.showtext();

		c1.close();
	}

}
