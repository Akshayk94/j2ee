package demo.spring.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("m1")
@Scope("singleton")                //default scope is singleton
public class Master1
{
	void test()
	{
		System.out.println("TEST METHOD");
	}
}
