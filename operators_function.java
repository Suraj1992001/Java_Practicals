//WAP To Perform Operators With The Help Of Function
import java.util.*;									//Importing Scanner Class
public class operators_function								//Operators Function Class	
{
	public static void main(String[] args) 						//Main Class
	{
		accept_details();							//Calling 'accept_details' Function
	}
	public static void accept_details()						//'accept_details' Fuction
	{	
		Scanner sc = new Scanner(System.in);					//Creating Object For Scanner Class
		int a,b,c,d,e,f;							//Declaring Variables
		System.out.println("Enter two numbers:");				//Taking Input
		a = sc.nextInt();							//Giving Input
		b = sc.nextInt();	
		arithmetic_operators(a,b);						//Calling 'arithmetic_operators' Function
		bitwise_operators(a,b);							//Calling 'bitwise_operators' Function
		relational_operators(a,b);						//Calling 'relational_operators' Function
	        System.out.println("Enter four numbers:");
	        c = sc.nextInt();
	        d = sc.nextInt();
	        e = sc.nextInt();
	        f = sc.nextInt();
	        logical_operators(a,b,c,d);						//Calling 'logical_operators' Function
	        assignment_operators(a,b,c,d,e,f);					//Calling 'assignment_operators' Function
	}
	public static void arithmetic_operators(int a,int b)				//'arithmetic_operators' Function
	{
		int add,sub,mul,div,mod;
		add = a+b;								//Performing Operations
		sub = a-b;
		mul = a*b;
		div = a/b;
		mod = a%b;
		System.out.println("Addition of two numbers is:"+add);			//Displaying Output
		System.out.println("Subtraction of two numbers is:"+sub);
		System.out.println("Multiplication of two numbers is:"+mul);
		System.out.println("Division of two numbers is:"+div);
		System.out.println("Modulus of two numbers is:"+mod);
	}
	public static void assignment_operators(int a,int b,int c,int d,int e,int f)	//'assignment_operators' Function
	{
		a += b;
		c -= b;
		d *= b;
		e /= b;
		f %= b;
		System.out.println("Assignment Addition of two numbers is:"+a);
		System.out.println("Assignment Subtraction of two numbers is:"+c);
		System.out.println("Assignment Multiplication of two numbers is:"+d);
		System.out.println("Assignment Division of two numbers is:"+e);
		System.out.println("Assignment Modulus of two numbers is:"+f);
	}
	public static void bitwise_operators(int a,int b)				//'bitwise_operators' Function
	{
		int ans_and,ans_or,ans_xor;
		ans_and = a & b;
		ans_or = a | b;
		ans_xor = a ^ b;
		System.out.println("The answer of AND operator is:"+ans_and);
		System.out.println("The answer of OR operator is:"+ans_or);
		System.out.println("The answer of XOR operator is:"+ans_xor);
	}
	public static void relational_operators(int a,int b)				//'relational_operators' Function
	{
		System.out.println("The answer is:");
		System.out.println(a<b);
		System.out.println("The answer is:");
		System.out.println(a>b);
		System.out.println("The answer is:");
		System.out.println(a<=b);
		System.out.println("The answer is:");
		System.out.println(a>=b);
		System.out.println("The answer is:");
		System.out.println(a!=b);
		System.out.println("The answer is:");
		System.out.println(a==b);
	}
	public static void logical_operators(int a,int b,int c,int d)			//'logical_operators' Function
	{	
		System.out.println("The answer is:");
		System.out.println((a<b)&&(c>d));
		System.out.println("The answer is:");
		System.out.println((a<b)||(c>d));
		System.out.println("The answer is:");
		System.out.println(!(a<b));
	}
}
