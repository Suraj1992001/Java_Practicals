//WAP To Accept Radius Of Circle From User And Find Out Area And Circumference Of Circle
import java.util.*;                                               //Importing Scanner Class
public class area_circum_circle                                   //Area And Circumference Of Circle Class
{
    public static void main(String args[])                        //Main Class
    {
        Scanner sc = new Scanner(System.in);                      //Creating Object For Scanner Class
        int r;                                                    //Declaring Variables
        float area,circum,PI = 3.14F;
        System.out.println("Enter The Radius Of Circle:");        //Taking Input
        r = sc.nextInt();                                         //Giving Input
        area = 3.14F * r * r;                                     //Performing Function
        circum = 2 * 3.14F * r;
        System.out.println("Area Of Circle Is:"+area);            //Displaying Output
        System.out.println("Circumference Of Circle Is:"+circum);
    }
}
