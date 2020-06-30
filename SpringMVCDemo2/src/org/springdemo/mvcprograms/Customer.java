package org.springdemo.mvcprograms;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

//MODEL CLASS   
public class Customer 
{
	@NotNull(message="is required")
	@Size(min=3, message="is required")
	private String customerName;
	
	
	@NotNull(message="is required")
	@Size(min=3, message="is required")
	private String cityName;
	
	@NotNull(message="is required")
	@Min(value=0, message="MUST BE GREATER THAN ZERO")
	@Max(value=10, message="MUST BE LESS THAN TEN")
	private int couponCount;
	
	@NotNull(message="is required")
	@Pattern(regexp="^\\S+@\\S+\\.\\S+$", message="INVALID EMAIL")
	private String customerEmail;
	
	@NotNull(message="is required")
	@Past
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date birthDate;
	
	
	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public int getCouponCount()
	{
		return couponCount;
	}
	
	public void setCouponCount(int couponCount)
	{
		this.couponCount = couponCount;
	}
	
	public String getCustomerName() 
	{
		return customerName;
	}
	
	public String getCityName() 
	{
		return cityName;
	}
	
	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}
	
	public void setCityName(String cityName)
	{
		this.cityName = cityName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
}
