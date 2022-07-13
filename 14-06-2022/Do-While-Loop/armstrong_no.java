//WAP To Accept A Number From User And Find Whether It Is Armstrong Or Not
import java.util.*;                                         //Importing Scanner Class
public class armstrong_no                                   //Armstrong Number Class
{
    public static void main(String args[])                  //Main Class
    {
        int a,rem,num,sum=0;                                //Declaring Variables
        Scanner sc = new Scanner(System.in);                //Creating Object For Scanner Class
        System.out.println("Enter a no.:");                 //Taking Input
        a = sc.nextInt();                                   //Giving Input
        num = a;                                            //Assigning Value
        do                                                  //Using do-while loop
        {
            rem = a % 10;                                   //Performing Operation
            sum = sum + (rem * rem * rem);
            a = a / 10;
        }
        while (a>0);                                        //Condition In while loop
        if(sum == num)                                      //Using if-else Statement
        {
            System.out.println(num+" is an armstrong no."); //Displaying Output
        }
        else
        {
            System.out.println(num+" is not an armstrong no.");
        }
    }
}
