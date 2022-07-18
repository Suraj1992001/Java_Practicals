package Abstraction;
public class con_class2 extends abs_class2
{
	public static void main(String[] args)
	{
		con_class2 obj = new con_class2();
		obj.abs_met();
		obj.con_met();
	}
	@Override
	public void abs_met() 
	{
		int size,i;
		System.out.println("Enter the size of an array:");
		size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements in an array:");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp=arr[0];
		for(i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The elments of an array in descending order is:");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}
