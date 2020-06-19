package demo.spring.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("m2")
@Scope("prototype")
public class Master2 
{
	void display()
	{
		System.out.println("DISPLAY METHOD");
	}
}
