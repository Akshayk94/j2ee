package shops;

public class ElectronicsShop implements Shop 
{
	//dependency declaration
	ElectronicsProducts eproducts;
	
	
	//constructor injection
	public ElectronicsShop(ElectronicsProducts eproducts) 
	{
		this.eproducts = eproducts;
	}


	@Override
	public void getShopType() 
	{
		System.out.println("THIS IS AN ELECTRONICS SHOP");
	}


	//ACCESS PROPERTIES OF ELECTRONICS PRODUCTS
	@Override
	public void getProducts() 
	{
		eproducts.getProductType();
	}
}
