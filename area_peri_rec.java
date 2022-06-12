//WAP To Accept Length And Breadth Of Rectangle From User And Calculate Area And Perimeter Of Rectangle
import java.util.*;                                             //Importing Scanner Class
public class area_peri_rec                                      //Area And Perimeter Of Rectangle Class
{
    public static void main(String args[])                      //Main Class
    {
        Scanner sc = new Scanner(System.in);                    //Creating Object For Scanner Class
        int l,b,area,peri;                                      //Declaring Variables
        System.out.println("Enter The Length Of Rectangle:");   //Taking Input
        l = sc.nextInt();                                       //Giving Input
        System.out.println("Enter The Breadth Of Rectangle:");
        b = sc.nextInt();
        area = l * b;                                           //Performing Functions
        peri = 2 * (l+b);
        System.out.println("Area Of Rectangle Is:"+area);       //Displaying Output
        System.out.println("Area Of Rectangle Is:"+peri);
    }
}
