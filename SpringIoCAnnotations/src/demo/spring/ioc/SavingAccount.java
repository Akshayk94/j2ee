package demo.spring.ioc;

import org.springframework.stereotype.Component;

@Component("account1")
public class SavingAccount implements Account
{
	double accountBalance=25000;

	@Override
	public void getAccountType() 
	{
		System.out.println("THIS IS SAVING ACCOUNT");
	}

	@Override
	public void deposit(double amt)
	{
		accountBalance=accountBalance+amt;
	}

	@Override
	public void getBalance() 
	{
		System.out.println("ACCOUNT BALANCE IS "+accountBalance);
	}

}
