package collectiondi;

public class Cards 
{
	private String cardType;
	private String cardNumber;
	
	public String getCardType() 
	{
		return cardType;
	}
	public String getCardNumber()
	{
		return cardNumber;
	}
	public void setCardType(String cardType) 
	{
		this.cardType = cardType;
	}
	public void setCardNumber(String cardNumber) 
	{
		this.cardNumber = cardNumber;
	}
	
	public String toString()
	{
		return cardNumber+"\t"+cardType;
	}
}
