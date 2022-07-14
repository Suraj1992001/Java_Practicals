package practicals_14_07_2022;
public class display_2 extends fibonacci 
{
	public void print()
	{
		while(first_num < n)
		{
			System.out.print(first_num+" , ");
			next_num = first_num + sec_num;
			first_num = sec_num;
			sec_num = next_num;
		}
		System.out.println("\n");
	}
	public void print2()
	{
		if(temp==rev)
		{
			System.out.println("The number "+temp+" is pallindrome");
		}
		else
		{
			System.out.println("The number "+temp+" is not pallindrome");
		}
	}
}
