//WAP To Accept Elements Of The Array And Then Find The Average Of The Array
import java.util.*;						//Importing Scanner Class
public class finding_average 					//Finding Average Class
{
	static int i;						//Variable Declared Globally
	public static void main(String[] args)			//Main Class
	{
		accept_details();				//Calling 'accept_details();' Function
	}
	public static void accept_details()			//'accept_details();' Function
	{
		int size,i;					//Declaring Variables
		Scanner sc = new Scanner(System.in);		//Creating Object For Scanner Class
		System.out.println("Enter the size:");		//Taking Input
		size = sc.nextInt();				//Giving Input
		int arr[] = new int[size];			//Declaring Array
		System.out.println("Enter the elements:");
		for(i=0;i<size;i++)				//Using for loop
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The elements are:");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");		//Displaying Output
		}
		average(size,arr);				//Calling Parameterized Function 'average()'
		
	}
	public static void average(int size,int[] arr)		//Parameterized Function 'average()'
	{
		int avg,sum=0;
		System.out.println("The average of all the elements is:");
		for(i=0;i<size;i++)
		{
			sum += arr[i];				//Performing Operations
			
		}
		avg = sum/size;
		System.out.print(avg);
	}
}
