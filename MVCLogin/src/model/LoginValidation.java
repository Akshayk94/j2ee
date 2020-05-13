package model;


//MODEL LAYER
public class LoginValidation 
{
	public boolean validate(String user,String password)
	{
		if(user.equals("admin") && password.equals("123"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
