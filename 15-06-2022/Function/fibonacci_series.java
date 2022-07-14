//WAP To Accept A Number From User And Display The Fibonacci Seies
import java.util.*;											//Importing Scanner Class
public class fibonacci_series 										//Fibonacci Series Class
{
	public static void main(String args[])								//Main Class
	{
		accept_details();									//Calling 'accept_details' Function
	}	
	public static void accept_details()								//'accept_details' Function
	{
		Scanner sc = new Scanner(System.in);							//Creating Object For Scanner Class
		int n;											//Declaring Variable
		System.out.println("Enter the number upto which you want to print fibonacci series:");	//Taking Input
		n = sc.nextInt();									//Giving Input
		fibonacci(n);										//Calling 'fibonacci' Function
	}	
	public static void fibonacci(int n)								//'fibonacci' Function
	{
		int next_num,first_num=0,sec_num=1;
		while(first_num <= n)									//Using while loop
		{
			System.out.print(first_num+" , ");
			next_num = first_num + sec_num;							//Performing Operations
			first_num = sec_num;
			sec_num = next_num;
		}
	}
}
