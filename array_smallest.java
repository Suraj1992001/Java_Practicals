//WAP To Smallest Number Among 10 Numbers
import java.util.*;                                 //Importing Scanner Class
public class array_smallest                         //Array Smallest Class
{
    public static void finding_smallest()           //'finding_smallest' Function
    {
        int i,temp,num[] = new int[10];             //Declaring Variables And Array
        Scanner sc = new Scanner(System.in);        //Creating Object For Scanner Class
        System.out.println("Enter the numbers:");   //Taking Input
        for(i=0;i<10;i++)                           //Using for loop
        {
            num[i] = sc.nextInt();                  //Giving Input
        }
        System.out.println("The numbers are:");     //Displaying Output
        for (i=0;i<10;i++)
        {
            System.out.println(num[i]);
        }
        temp=num[0];                                //Assigning First Element Of The Array To temp Variable
        for (i=0;i<10;i++)
        {
            if(temp>num[i])                         //Using if Statement
            {
                temp = num[i];                      //Comparing All The Elements Of The Array With Each Other
            }
        }
        System.out.println("The smallest number is:"+temp);
    }
    public static void main(String ags[])           //Main Class
    {
        finding_smallest();                         //Calling 'finding_greatest' Function
    }
}
