package demo.spring.si;

import org.springframework.stereotype.Component;

@Component("processor1")
public class Pentium implements Processor
{

	@Override
	public void getProcessorType() 
	{
		System.out.println("PROCESSOR TYPE IS PENTIUM");
	}

}
