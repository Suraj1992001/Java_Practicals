package practicals_14_07_2022;
import java.util.*;
public class sum_of_digits 
{
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		sum_of_digits obj = new sum_of_digits();
		obj.loop_demo();
	}
	public void loop_demo()
	{
		int num,rem,sum=0;
		System.out.println("Enter any positive number:");
		num=sc.nextInt();
		while(num>0)
		{
			rem=num%10;
			sum += rem;
			num /= 10;
		}
		System.out.println("The sum of digits of the number is:"+sum);
	}
}
