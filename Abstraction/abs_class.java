package Abstraction;
import java.util.*;
public abstract class abs_class 
{
	Scanner sc = new Scanner(System.in);
	public abstract void fib();
	public void sod()
	{
		int n,rem,sum=0;
		System.out.println("Enter the number:");
		n = sc.nextInt();
		do
		{
			rem = n % 10;
			sum += rem;
			n /= 10;
		}
		while(n>0);
		System.out.println("The sum of digits of is: "+sum);
	}
}