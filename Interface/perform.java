//WAP To Perform Interface By Using Two Classes In Which:- 1 Class : Finding The Smallest Number By Using Array , 2 Class : Finding Reverse Of A Number
package Interface;									//Creating A Package Of Name 'Interface' In Which More Than One Class Can Be Implemented
import java.util.*;									//Importing Scanner Class
public class perform implements rev_of_num,small_array					//Class That Implement Interface
{
	Scanner sc = new Scanner(System.in);						//Creating Object For Scanner Class
	public static void main(String[] args)						//Main Class
	{
		perform obj = new perform();						//Creating Object For 'perform' Class
		obj.rev();								//Calling 'rev()' Function By Using Object
		obj.smallest_using_array();						//Calling 'smallest_using_array()' Function By Using Object
	}
	@Override									//Overriding 'smallest_using_array()' Function
	public void smallest_using_array() 
	{
		int size,i,j,temp;							//Declaring Variables
		System.out.println("Enter the size of an array:");			//Taking Input
		size = sc.nextInt();							//Giving Input
		int[] arr = new int[size];
		System.out.println("Enter the elements of an array:");
		for(i=0;i<size;i++)							//Performing For Loop
		{
			arr[i] = sc.nextInt();
		}
		temp = arr[0];								//Putting First Element Of An Array Into 'temp' Variable
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]<arr[j])					//Comparing The Array Elements Using If Statement
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The smallest number in the array is: "+temp);	//Printing The Output
	}
	@Override
	public void rev()								//Overriding 'rev()' Function
	{
		int n,rem,rev=0;
		System.out.println("Enter the number:");
		n = sc.nextInt();
		while(n != 0)								//Performing Reverse Of A Number By Using While Loop
		{
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		System.out.println("The reverse of a number is: "+rev);
	}
}
