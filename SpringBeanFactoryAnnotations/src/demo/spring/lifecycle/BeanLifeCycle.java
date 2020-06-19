package demo.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("sample")
public class BeanLifeCycle 
{
	@PostConstruct
	public void startupCode()
	{
		System.out.println("CUSTOM INIT METHOD");
	}
	
	public void showtext()
	{
		System.out.println("NORMAL TEXT METHOD");
	}
	
	@PreDestroy
	public void shutdownCode()
	{
		System.out.println("CUSTOM DESTROY METHOD");
	}
}
