/*WAP To Perform Abstraction Using Abstract Classes In Which :	1 : Abstract Method : Sorting The Array Elements In Descending Order
								2 : Concrete Method : Finding The Number Is Pallindrome Or Not*/
package Abstraction;						//Creating A Package 'Abstraction' To Store Multiple Classes
import java.util.*;						//Importing Scanner Class
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
