import java.util.*;
public class fibonacci_series 
{
	public static void main(String args[])
	{
		accept();
	}	
	public static void accep_details()
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number upto which you want to print fibonacci series:");
		n = sc.nextInt();
		fibonacci(n);
	}	
	public static void fibonacci(int n)
	{
		int next_num,first_num=0,sec_num=1;
		while(first_num <= n)
		{
			System.out.print(first_num+" , ");
			next_num = first_num + sec_num;
			first_num = sec_num;
			sec_num = next_num;
		}
	}
}
