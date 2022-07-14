import java.util.*;
public class operators_function 
{
	public static void main(String[] args) 
	{
		accept_details();
	}
	public static void accept_details()
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e,f;
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		arithmetic_operators(a,b);
		bitwise_operators(a,b);
		relational_operators(a,b);
	    System.out.println("Enter four numbers:");
	    c = sc.nextInt();
	    d = sc.nextInt();
	    e = sc.nextInt();
	    f = sc.nextInt();
	    logical_operators(a,b,c,d);
	    assignment_operators(a,b,c,d,e,f);
	}
	public static void arithmetic_operators(int a,int b)
	{
		int add,sub,mul,div,mod;
		add = a+b;
		sub = a-b;
		mul = a*b;
		div = a/b;
		mod = a%b;
		System.out.println("Addition of two numbers is:"+add);
		System.out.println("Subtraction of two numbers is:"+sub);
		System.out.println("Multiplication of two numbers is:"+mul);
		System.out.println("Division of two numbers is:"+div);
		System.out.println("Modulus of two numbers is:"+mod);
	}
	public static void assignment_operators(int a,int b,int c,int d,int e,int f)
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
	public static void bitwise_operators(int a,int b)
	{
		int ans_and,ans_or,ans_xor;
		ans_and = a & b;
		ans_or = a | b;
		ans_xor = a ^ b;
		System.out.println("The answer of AND operator is:"+ans_and);
		System.out.println("The answer of OR operator is:"+ans_or);
		System.out.println("The answer of XOR operator is:"+ans_xor);
	}
	public static void relational_operators(int a,int b)
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
	public static void logical_operators(int a,int b,int c,int d)
	{	
		System.out.println("The answer is:");
		System.out.println((a<b)&&(c>d));
		System.out.println("The answer is:");
		System.out.println((a<b)||(c>d));
		System.out.println("The answer is:");
		System.out.println(!(a<b));
	}
}
