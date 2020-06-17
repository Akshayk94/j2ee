package scopes;

public class Facebook 
{
	String username;
	
	void acceptUsername(String username)
	{
		this.username=username;
	}
	
	void displayProfile()
	{
		System.out.println("Hiiiii "+username);
	}
}
