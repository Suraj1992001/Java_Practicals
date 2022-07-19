package Polymorphism;
import java.util.*;
public class method_overloading 
{
	float area;
	int Area;
	public static void main(String[] args) 
	{
		method_overloading obj = new method_overloading(); 
		obj.accept();
	}
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		float r;
		System.out.println(" Enter the radius of circle in float format:");
		r=sc.nextFloat();
		calc_area(r);
		int l,b;
		System.out.println("\n Enter the length and breadth of a rectangle in int format:");
		l=sc.nextInt();
		b=sc.nextInt();
		calc_area(l,b);
		float R,h;
		System.out.println("\n Enter the radius and height of a cylinder in float format:");
		R=sc.nextFloat();
		h=sc.nextFloat();
		calc_area(R,h);
		int s;
		System.out.println("\n Enter the side of a square in int format:");
		s=sc.nextInt();
		calc_area(s);
		double B,H;
		System.out.println("\n Enter the base and height of a triangle in double format:");
		B=sc.nextDouble();
		H=sc.nextDouble();
		calc_area(B,H);
	}
	public void calc_area(float r)
	{
		area=3.14f*r*r;
		System.out.println("Area of circle is :"+area);
	}
	public void calc_area(int l,int b)
	{
		Area=l*b;
		System.out.println("Area of rectangle is :"+Area);
	}
	public void calc_area(float r,float h)
	{
		area=2*3.14f*r*h;
		System.out.println("Lateral surface area of cylinder is :"+area);
		area=2*3.14f*r*(r+h);
		System.out.println("Total surface area of cylinder is :"+area);
	}
	public void calc_area(int s)
	{
		Area=s*s;
		System.out.println("Area of square is :"+Area);
	}
	public void calc_area(double b,double h)
	{
		double area;
		area=(b*h)/2;
		System.out.println("Area of triangle is :"+area);
	}
}
