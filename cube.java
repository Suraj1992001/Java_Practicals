//WAP To Accept The Number And If The Number Is Even Find The Cube Of The Number
import java.util.*;                                         //Importing Scanner Class
public class cube                                           //Declaring Cube Class
{
    public static void main(String args[])                  //Declaring Main Class
    {
        Scanner sc = new Scanner(System.in);                //Creating Object For Scanner Class
        int a,cube;                                         //Declaring Variables
        System.out.println("Enter The Number:");            //Taking Input
        a = sc.nextInt();                                   //Giving Input
        if (a % 2 == 0)                                     //Checking Whether The Number Is Even Or Not
        {
            cube = a * a * a;                               //Performing Cube Function
            System.out.println("Cube of "+a+" is:"+cube);   //Displaying The Result
        }
    }
}
