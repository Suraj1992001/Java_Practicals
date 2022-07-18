package Encapsulation;
import java.util.*;
public class derived_class_1 extends base_class_1 
{
	Scanner sc = new Scanner(System.in);
	String name;
	int roll,size,i;
	char grade;
	float per;
	public static void main(String[] args) 
	{
		derived_class_1 obj = new derived_class_1();
		obj.accept();
		obj.display();
	}
	public void accept()
	{
		System.out.println("Enter Student Name:");
		name=sc.next();
		System.out.println("Enter Student Roll Number:");
		roll=sc.nextInt();
		System.out.println("Enter Number of Subjects:");
		size=sc.nextInt();
		int[] marks = new int[size];
		System.out.println("Enter Marks of Subjects:");
		for(i=0;i<size;i++)
		{
			marks[i]=sc.nextInt();
		}
		int sum=0;
		for(i=0;i<size;i++)
		{
			sum += marks[i];
			per=(sum*100)/500f;
		}
		set_percent(per);
		if(per>80.0)
		{
			grade='A';
		}
		else if(per<80.0 && per>60.0)
		{
			grade='B';
		}
		else if(per<60.0 && per>40.0)
		{
			grade='C';
		}
		else
		{
			grade='F';
		}
		set_gd(grade);
	}
	public void display()
	{
		System.out.println("Student Name: "+name);
		System.out.println("Student Roll Number: "+roll);
		System.out.println("Student's Percentage: "+get_percent());
		System.out.println("Student's Grade: "+get_gd());
	}
}	
