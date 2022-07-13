//WAP To Implement Abstraction By Using Abstract Class
package Abstraction;
public class abs_demo extends abs_class 
{
	public static void main(String[] args)
	{
		abs_demo obj = new abs_demo();
		obj.sod();
		obj.fib();
	}
@Override
public void fib() 
	{
		int n,next_num,first_num=0,sec_num=1;
		System.out.println("Enter the number upto which you want to print fibonacci series:");
		n = sc.nextInt();
		while(first_num < n)
		{
			System.out.print(first_num+" , ");
			next_num = first_num + sec_num;
			first_num = sec_num;
			sec_num = next_num;
		}
	}
}
