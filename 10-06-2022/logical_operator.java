//WAP To Perform Operations Using Logical Operator
import java.util.*;                               //Importing Scanner Class
public class logical_operator                     //Logical Operator Class
{
    public static void main(String args[])        //Declaring Main Class
    {
        Scanner sc = new Scanner(System.in);      //Declaring Scanner Class
        int a,b,c,d;                              //Declaring Variables
        System.out.println("Enter Four Numbers:");//Taking Input
        a=sc.nextInt();                           //Giving Input
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        System.out.println((a>b)&&(c<d));         //Performing 'AND' Functions And Printing Output
        System.out.println((a>b)||(c<d));         //Performing 'OR' Functions And Printing Output
        System.out.println(!(c<d));               //Performing 'NOT' Functions And Printing Output
    }
}
