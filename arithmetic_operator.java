//WAP To Perform The Arithmetic Operations Using Arithmetic Operators
import java.util.*;                                              //Importing Scanner Class
public class arithmetic_operator                                 //Arithmetic Operator Class
{
    public static void main(String args[])                       //Main Class
    {
        Scanner sc = new Scanner(System.in);                     //Creating Object For Class Scanner
        int a,b,add,sub,mul,div,mod;                             //Declaring Variables
        System.out.println("Enter Two Numbers:");                //Taking Input
        a=sc.nextInt();                                          //Giving Input
        b=sc.nextInt();
        add=a+b;                                                 //Performing Operation
        sub=a-b;
        mul=a*b;
        div=a/b;
        mod=a%b;
        System.out.println("Addition Of Two Numbers:"+add);      //Displaying Addition Result
        System.out.println("Subtraction Of Two Numbers:"+sub);   //Displaying Subtraction Result
        System.out.println("Multiplication Of Two Numbers:"+mul);//Displaying Multiplication Result
        System.out.println("Division Of Two Numbers:"+div);      //Displaying Division Result
        System.out.println("Modulus Of Two Numbers:"+mod);       //Displaying Modulus Result
    }
}
