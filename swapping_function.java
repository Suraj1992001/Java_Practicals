//WAP To Accept Two Numbers From User And Swap The Numbers Using Third Number And Without Third Number Using Function
import java.util.*;                                                     //Importing Scanner Class
public class swapping_function                                          //Swapping Function Class
{
    public static void main(String args[])                              //Main Class
    {
        accept();                                                       //Calling 'accept();' Function
    }
    public static void accept()                                         //Declaring Accept Function
    {
        Scanner sc = new Scanner(System.in);                            //Creating A Object For Scanner Class
        int a,b;                                                        //Declaring Variable
        System.out.println("Enter two no.s:");                          //Taking Input
        a = sc.nextInt();                                               //Giving Input
        b = sc.nextInt();
        swap_using_third(a,b);                                          //Calling 'swap_using_third();' Function
        swap_without_third(a,b);                                        //Calling 'swap_without_third();' Function
    }
    public static void swap_using_third(int a,int b)                    //Declaring Swap Using Third Function
    {
        int c;
        System.out.println("Before swapping the values are: "+a+" "+b); //Displaying Output Before Swapping
        c = a;                                                          //Applying Logic
        a = b;
        b = c;
        System.out.println("After swapping the values are: "+a+" "+b);  //Displaying Output After Swapping
    }
    public static void swap_without_third(int a,int b)                  //Declaring Swap Without Third Function
    {
        System.out.println("Before swapping the values are: "+a+" "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping the values are: "+a+" "+b);
    }
}
