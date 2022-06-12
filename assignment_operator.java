//WAP To Perform Operations Using Assignment Operator
import java.util.*;                                                        //Importing Scanner Class
public class assignment_operator                                           //Assignment Operator Class
{
    public static void main(String args[])                                 //Main Class
    {
        Scanner sc=new Scanner(System.in);                                 //Creating Object For Scanner Class
        int a,b,c,d,e,f;                                                   //Declaring Variables
        System.out.println("Enter Five Numbers:");                         //Taking Input
        a= sc.nextInt();                                                   //Giving Input
        b= sc.nextInt();
        c= sc.nextInt();
        d= sc.nextInt();
        e= sc.nextInt();
        f= sc.nextInt();
        a+=b;                                                              //Performing Operations
        c-=b;
        d*=b;
        e/=b;
        f%=b;
        System.out.println("Addition Assignment Operator Result:"+a);      //Displaying Addition Assignment Result
        System.out.println("Subtraction Assignment Operator Result:"+c);   //Displaying Subtraction Assignment Result
        System.out.println("Multiplication Assignment Operator Result:"+d);//Displaying Multiplication Assignment Result
        System.out.println("Division Assignment Operator Result:"+e);      //Displaying Division Assignment Result
        System.out.println("Modulus Assignment Operator Result:"+f);       //Displaying Modulus Assignment Result
    }
}
