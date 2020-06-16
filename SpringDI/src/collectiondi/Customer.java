package collectiondi;

import java.util.Set;

public class Customer 
{
	private int customerId;
	private String customerName;
	
	private Set<Order> orderlist;
	private Set<Cards> cardlist;
	
	public Set<Cards> getCardlist()
	{
		return cardlist;
	}
	public void setCardlist(Set<Cards> cardlist) 
	{
		this.cardlist = cardlist;
	}
	public int getCustomerId() 
	{
		return customerId;
	}
	public String getCustomerName() 
	{
		return customerName;
	}
	public Set<Order> getOrderlist() 
	{
		return orderlist;
	}
	public void setCustomerId(int customerId)
	{
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	
	//setter injection
	public void setOrderlist(Set<Order> orderlist) 
	{
		this.orderlist = orderlist;
	}
	
	//display orders placed by customer
	
	public void displayOrderInfo()
	{
		System.out.println(customerId+"\t"+customerName);
		System.out.println("ORDERS PLACED ARE: ");
		System.out.println("-------------------------------");
		for(Order o:orderlist)
		{
			System.out.println(o);
		}
	}
	
	//display cards of customer
	
	public void displayCardInfo()
	{
		System.out.println(customerId+"\t"+customerName);
		System.out.println("SAVED CARDS ARE: ");
		System.out.println("--------------------------------");
		for(Cards c:cardlist)
		{
			System.out.println(c);
		}
	}
}
