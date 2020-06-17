package scopes;

public class GoogleAccount 
{
	String applicationType;
	
	void acceptApplicationType(String applicationType)
	{
		this.applicationType=applicationType;
	}
	
	void showType()
	{
		System.out.println("YOU ARE USING "+applicationType);
	}
}
