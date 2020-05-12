package test;

//BUSINESS LOGIC
public class BillDetails 
{
	public static double calculateBill(double price,int qty,String os)
	{
		double finalAmount=0.0;
		if(os.equals("android"))
		{
			//10% discount
			double total=qty*price;
			finalAmount=total-(total*0.1);
		}
		else if(os.equals("ios"))
		{
			//5% discount
			double total=qty*price;
			finalAmount=total-(total*0.05);
		}
		
		return finalAmount;
	}
}
