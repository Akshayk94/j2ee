package domain;

import javax.persistence.*;

@Entity
@Table(name="city_master")
public class City //child table
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="city_id")
	private int cityId;
	
	@Column(name="city_name")
	private String cityName;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="country_ref")
	private CountryDetails countryref;

	public int getCityId() 
	{
		return cityId;
	}

	public void setCityId(int cityId)
	{
		this.cityId = cityId;
	}

	public String getCityName()
	{
		return cityName;
	}

	public void setCityName(String cityName)
	{
		this.cityName = cityName;
	}

	public CountryDetails getCountryref()
	{
		return countryref;
	}

	public void setCountryref(CountryDetails countryref)
	{
		this.countryref = countryref;
	}
}
