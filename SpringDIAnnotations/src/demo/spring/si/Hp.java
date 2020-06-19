package demo.spring.si;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("laptop2")
public class Hp implements Laptop 
{
	private Processor processType;
	
	//setter injection
	@Autowired
	@Qualifier("processor1")
	public void setProcessType(Processor processType)
	{
		this.processType = processType;
	}

	@Override
	public void getLaptopCategory() 
	{
		System.out.println("THIS IS A BUSINESS LAPTOP");
	}

	@Override
	public void showProcessorDetails() 
	{
		processType.getProcessorType();
	}

}
