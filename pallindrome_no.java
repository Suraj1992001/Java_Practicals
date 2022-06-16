//WAP To Accept A Number From User And Find Whether It Is Pallindrome Number Or Not
import java.util.*;								//Importing Scanner Class
public class pallindrome_no							//Pallindrome Number Class 								
{
	public static void pallindrome()					//'pallindrome' Function
	{
		int n,num,rem,rev=0;						//Declaring Variables
		Scanner sc = new Scanner(System.in);				//Creating Object For Scanner Class
		System.out.println("Enter the number:");			//Taking Input
		n = sc.nextInt();						//Giving Input
		num = n;							//Performing Operation
		while(n != 0)							//Using while Loop
		{
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		if(num == rev)							//Using if-else Statement
		{
			System.out.println("It is a pallindrome number");	//Displaying Output
		}
		else
		{
			System.out.println("It is not a pallindrome number");
		}
	}
	public static void main(String args[])					//Main Class
	{
		pallindrome();							//Calling Function
	}
}	
