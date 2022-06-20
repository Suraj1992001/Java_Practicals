/*WAP To Accept Size And Elements Of Array From User And Perform The Following Using Switch Case
1.Greater No.   2.Smaller No.  3.Ascending Order  4.Descending Order*/
import java.util.*;								//Importing Scanner Class
public class array_switch 							//'array_switch' Class
{
	static int i,j,temp,Scanner sc = new Scanner(System.in);		//Declaring Variables Globally
	public static void accept_details()					//'accept_details' Function
	{
		int n;								//Declaring Variable Locally
		System.out.println("Enter the size of your array:");		//Taking Input
		n = sc.nextInt();						//Giving Input
		int arr[]=new int[n];						//Declaring Array
		System.out.println("Enter the elements in your array:");
		for(i=0;i<n;i++)						//Using for loop For Entering The Array Elements
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The elements in your array:");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		switch_functions(n,arr);
	}
	public static void switch_functions(int n,int arr[])
	{
		int ch;
		System.out.println("1.Greater No. \t 2.Smaller No. \t 3.Ascending Order \t 4.Descending Order");
		System.out.println("Enter your choice:");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				   temp = arr[0];
				   for(i=0;i<n;i++)
				   {
					   if(temp<arr[i])
					   {
						   temp = arr[i];
					   }
				   }
				   System.out.println("\nThe greatest no. is:"+temp);
				   break;
			case 2:
				   temp = arr[0];
				   for(i=0;i<n;i++)
				   {
					   if(temp<arr[i])
					   {
						   temp = arr[i];
					   }
				   }
				   System.out.println("The smallest no. is:"+temp);
				   break;
			case 3:
				   for(i=0;i<n;i++)
				   {
					   for(j=i+1;j<n;j++)
					   {
						   if(arr[i]>arr[j])
						   {
							   temp = arr[i];
							   arr[i] = arr[j];
							   arr[j] = temp;
						   }
					   }
				   }
				   System.out.println("The numbers are:");
				   for(i=0;i<n;i++)
				   {
					   System.out.println(arr[i]+"\t");
				   }
				   break;
			case 4:
				   for(i=0;i<n;i++)
				   {
					   for(j=i+1;j<n;j++)
					   {
						   if(arr[i]<arr[j])
						   {
							   temp = arr[i];
							   arr[i] = arr[j];
							   arr[j] = temp;
						   }
					   }
				   }
				   System.out.println("The numbers are:");
				   for(i=0;i<n;i++)
				   {
					   System.out.println(arr[i]+"\t");
				   }
				   break;
			default:System.out.println("Invalid Choice");	   
		}
	}
	public static void main(String args[])
	{
		accept_details();
	}
}
