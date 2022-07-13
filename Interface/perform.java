package Interface;
import java.util.*;
public class perform implements rev_of_num,small_array 
{
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		perform obj = new perform();
		obj.rev();
		obj.smallest_using_array();
	}
	@Override
	public void smallest_using_array() 
	{
		int size,i,j,temp;
		System.out.println("Enter the size of an array:");
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of an array:");
		for(i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		temp = arr[0];
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The smallest number in the array is: "+temp);
	}
	@Override
	public void rev()
	{
		int n,rem,rev=0;
		System.out.println("Enter the number:");
		n = sc.nextInt();
		while(n != 0)
		{
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		System.out.println("The reverse of a number is: "+rev);
	}
}
