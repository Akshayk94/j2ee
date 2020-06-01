package domain;

import javax.persistence.*;

@Entity
@Table(name="laptop")
@PrimaryKeyJoinColumn(name="id")
public class Laptop extends Product
{
	@Column(name="laptop_brand")
	private String laptopBrand;

	public String getLaptopBrand() 
	{
		return laptopBrand;
	}

	public void setLaptopBrand(String laptopBrand) 
	{
		this.laptopBrand = laptopBrand;
	}
}
