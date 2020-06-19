package demo.spring.si;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("laptop1")
public class Acer implements Laptop 
{

	private Processor processType;
	
	
	//setter injection
	@Autowired
	@Qualifier("processor2")
	
	/*@Autowired
	 * public Acer(@Qualifier(processor2)Processor processType)
	 * {
	 * 
	 * }
	 * */
	public void setProcessType(Processor processType) 
	{
		this.processType = processType;
	}

	@Override
	public void getLaptopCategory() 
	{
		System.out.println("THIS IS A GAMING LAPTOP");
	}

	@Override
	public void showProcessorDetails() 
	{
		processType.getProcessorType();
	}

}
