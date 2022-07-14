package practicals_14_07_2022;
import java.util.*;
public class display_pyramid 
{
	Scanner sc = new Scanner(System.in);
	int rows,i,j,n=1;
	public static void main(String[] args) 
	{
		display_pyramid obj = new display_pyramid();
		obj.accept();
		obj.pattern_demo_1();
		obj.pattern_demo_2();
	}
	public void accept()
	{
		System.out.println("Enter the number of rows:");
		rows=sc.nextInt();
	}
	public void pattern_demo_1()
	{
		for(i=0;i<rows;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println("\n");
		}
	}
	public void pattern_demo_2()
	{
		for(i=0;i<rows;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(n+++" ");
			}
			System.out.println("\n");
		}
	}
}
