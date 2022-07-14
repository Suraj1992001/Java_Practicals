import java.util.*;
public class fibonacci_series 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,next_num,first_num=0,sec_num=1;
		System.out.println("Enter the number upto which you want to print fibonacci series:");
		n = sc.nextInt();
		while(first_num <= n)
		{
			System.out.print(first_num+" , ");
			next_num = first_num + sec_num;
			first_num = sec_num;
			sec_num = next_num;
		}
	}
}
