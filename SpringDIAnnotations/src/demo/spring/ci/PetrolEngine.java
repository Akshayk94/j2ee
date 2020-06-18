package demo.spring.ci;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements Engine
{
	@Override
	public void displayEngineType() 
	{
		System.out.println("THIS IS PETROL ENGINE");
	}
}
