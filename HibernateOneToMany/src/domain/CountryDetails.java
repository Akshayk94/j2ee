package domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="country_master")
public class CountryDetails //parent table
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="country_id")
	private int countryId;//0
	
	@Column(name="country_name")
	private String countryName;//null
	
	@Column(name="country_code")
	private String countryCode;//null
	
	@OneToMany(mappedBy="countryref",cascade=CascadeType.ALL)
	private List<City> cityref;//default value null

	public int getCountryId() 
	{
		return countryId;
	}

	public void setCountryId(int countryId) 
	{
		this.countryId = countryId;
	}

	public String getCountryName() 
	{
		return countryName;
	}

	public void setCountryName(String countryName) 
	{
		this.countryName = countryName;
	}

	public String getCountryCode() 
	{
		return countryCode;
	}

	public void setCountryCode(String countryCode) 
	{
		this.countryCode = countryCode;
	}

	public List<City> getCityref() 
	{
		return cityref;
	}

	public void setCityref(List<City> cityref) 
	{
		this.cityref = cityref;
	}
	
	
	//helper method
	public void addCities(City tempcity)//object of city class
	{
		if(cityref==null)
		{
			cityref=new ArrayList<City>();
		}
		
		cityref.add(tempcity);
		tempcity.setCountryref(this);//set city for current country
	}
}
