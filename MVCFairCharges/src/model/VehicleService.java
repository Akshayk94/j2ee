package model;

//MODEL LAYER

public class VehicleService 
{
	public double calculateFair(String vehicletype,double km)
	{
		double totalamount=0.0;
		
		switch(vehicletype)
		{
			case "auto": totalamount=km*6;
						 break;
						 
			case "mini": totalamount=km*8;
						 break;
			
			case "prime": totalamount=km*10;
						  break;
		}
		
		return totalamount;
	}
	
	public int calculateWaitingCharges(int minutes)
	{
		int totalwaitingcharges=minutes*2;
		
		return totalwaitingcharges;
	}
}
