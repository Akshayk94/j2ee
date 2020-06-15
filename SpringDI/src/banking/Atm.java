package banking;

//MAIN ENTITY
public class Atm 
{
	//declaration of dependency
	private Printer print;
	
	//setter injection
	public void setPrint(Printer print) 
	{
		this.print = print;
	}

	//access dependency properties
	public void printBalanceInformation(int accNo)
	{
		print.printInfo(accNo);
	}
}
