package demo.spring.ci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle 
{
	//DEPENDENCY DECLARATION
	Engine e1;
	
	//CONSTRUCTOR INJECTION
	//AutoWired annotation is mandatory for Spring 4 but optional in Spring 5
	@Autowired
	public Bike(Engine e1) 
	{
		this.e1 = e1;
	}

	@Override
	public void getVehicleType() 
	{
		System.out.println("VEHICLE TYPE IS BIKE");
	}

	@Override
	public void getEngineType() 
	{
		e1.displayEngineType();
	}

}
