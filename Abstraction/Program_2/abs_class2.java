//WAP To Perform Abstraction Using Abstract Classes In Which 1:Abstract Method:
package Abstraction;
import java.util.*;
public abstract class abs_class2 
{
	Scanner sc = new Scanner(System.in);
	public abstract void abs_met();
	public void con_met()
	{
		int rem,sum=0,temp,num;
		System.out.println("\n Enter the number:");
		num=sc.nextInt();
		temp=num;
		do
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		while(num>0);
		if(sum==temp)
		{
			System.out.println("The number is pallindrome");
		}
		else
		{
			System.out.println("The number is not pallindrome");
		}
	}
}
