package practicals_14_07_2022;
import java.util.*;
public class pallindrome 
{
	Scanner sc = new Scanner(System.in);
	int rev=0,temp;
	public void perform()
	{
		int rem,num;
		System.out.println("Enter any number:");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num /= 10;
		}
		
	}
}
