//WAP To Accept Principal Amount,Rate Of Interest And No. Of Years From User And Calculate Simple Interest
import java.util.*;                                         //Importing Scanner Class
public class cal_simple_interest                            //Calculating Simple Interest Class
{
    public static void main(String args[])                  //Main Class
    {
        Scanner sc = new Scanner(System.in);                //Creating Object For Scanner Class
        int P,T;                                            //Declaring Variables
        float R,SI;
        System.out.println("Enter The Principal Amount:");  //Taking Input
        P = sc.nextInt();                                   //Giving Input
        System.out.println("Enter The Rate Of Interest:");
        R = sc.nextFloat();
        System.out.println("Enter The No. Of Years:");
        T = sc.nextInt();
        SI = (P * R * T)/100;                               //Performing Function
        System.out.println("Simple Interest Is:"+SI);       //Displaying Output
    }
}
