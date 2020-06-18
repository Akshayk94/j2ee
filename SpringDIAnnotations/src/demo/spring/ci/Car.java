package demo.spring.ci;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle 
{
	//DEPENDENCY DECLARATION
	private Engine e1;
	
	//CONSTRUCTOR INJECTION
	public Car(Engine e1) 
	{
		this.e1 = e1;
	}

	@Override
	public void getVehicleType() 
	{
		System.out.println("VEHICLE TYPE IS CAR");
	}

	@Override
	public void getEngineType() 
	{
		e1.displayEngineType();
	}

}
