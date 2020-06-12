package shops;

public class ComputerShop implements Shop 
{
	//dependency declaration
	ComputerProducts cproducts;
	
	
	//Constructor Injection
	public ComputerShop(ComputerProducts cproducts)
	{
		this.cproducts = cproducts;
	}

	
	@Override
	public void getShopType() 
	{
		System.out.println("THIS IS A COMPUTER SHOP");

	}

	//ACCESS PROPERTIES OF COMPUTER PRODUCTS
	@Override
	public void getProducts() 
	{
		cproducts.getProductType();
	}
}
