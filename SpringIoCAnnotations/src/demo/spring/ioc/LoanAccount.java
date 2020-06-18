package demo.spring.ioc;

import org.springframework.stereotype.Component;

@Component
public class LoanAccount implements Account 
{

	double loanAmount=1500000;
	
	@Override
	public void getAccountType() 
	{
		System.out.println("THIS IS LOAN ACCOUNT");
	}

	@Override
	public void deposit(double amt)
	{
		loanAmount=loanAmount-amt;
	}

	@Override
	public void getBalance()
	{
		System.out.println("ACTIVE LOAN AMOUNT IS "+loanAmount);
	}
}
