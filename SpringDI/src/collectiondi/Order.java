package collectiondi;

public class Order 
{
	private int orderId;
	private String orderNumber;
	
	
	public int getOrderId() 
	{
		return orderId;
	}
	public String getOrderNumber() 
	{
		return orderNumber;
	}
	public void setOrderId(int orderId)
	{
		this.orderId = orderId;
	}
	public void setOrderNumber(String orderNumber)
	{
		this.orderNumber = orderNumber;
	}
	
	public String toString()
	{
		return orderId+"\t"+orderNumber;
	}
}
