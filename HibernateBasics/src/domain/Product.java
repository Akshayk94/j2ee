package domain;

//JAVA BEAN CLASS OR DOMAIN CLASS OR POJO CLASS
public class Product
{
	private int productId;
	private String productName;
	private int productQty;
	private double productPrice;
	private String productCategory;
	
	public int getProductId() 
	{
		return productId;
	}
	public void setProductId(int productId)
	{
		this.productId = productId;
	}
	public String getProductName() 
	{
		return productName;
	}
	public void setProductName(String productName) 
	{
		this.productName = productName;
	}
	public int getProductQty() 
	{
		return productQty;
	}
	public void setProductQty(int productQty)
	{
		this.productQty = productQty;
	}
	public double getProductPrice() 
	{
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCategory() 
	{
		return productCategory;
	}
	public void setProductCategory(String productCategory)
	{
		this.productCategory = productCategory;
	}
	
	
}
