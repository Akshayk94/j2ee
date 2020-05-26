package domain;

import javax.persistence.*;

@Entity
@Table(name="passport_master")
public class Passport //PARENT TABLE
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="passport_id")
	private int passportId;
	
	@Column(name="passport_number")
	private String passportNumber;
	
	@Column(name="country")
	private String countryName;
	
	public int getPassportId()
	{
		return passportId;
	}
	public void setPassportId(int passportId)
	{
		this.passportId = passportId;
	}
	public String getPassportNumber() 
	{
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber)
	{
		this.passportNumber = passportNumber;
	}
	public String getCountryName() 
	{
		return countryName;
	}
	public void setCountryName(String countryName) 
	{
		this.countryName = countryName;
	}
}
