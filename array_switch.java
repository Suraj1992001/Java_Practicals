import java.util.*;
public class array_switch 
{
	static int i,j,temp;
	static Scanner sc = new Scanner(System.in);
	public static void accept_details()
	{
		int n;
		System.out.println("Enter the size of your array:");
		n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements in your array:");
		for(i=0;i<n;i++)
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
