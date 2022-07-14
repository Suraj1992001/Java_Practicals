package practicals_14_07_2022;
public class display extends pallindrome
{
	public void print()
	{
		if(temp==rev)
		{
			System.out.println("The number "+temp+" is pallindrome");
		}
		else
		{
			System.out.println("The number "+temp+" is not pallindrome");
		}
	}
}