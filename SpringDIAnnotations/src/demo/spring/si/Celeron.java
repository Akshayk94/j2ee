package demo.spring.si;

import org.springframework.stereotype.Component;

@Component("processor2")
public class Celeron implements Processor
{

	@Override
	public void getProcessorType() 
	{
		System.out.println("PROCESSOR TYPE IS CELERON");
		
	}

}
