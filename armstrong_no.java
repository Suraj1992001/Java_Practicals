import java.util.*;
public class armstrong_no
{
    public static void  main(String args[])
    {
        int a,rem,num,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.:");
        a = sc.nextInt();
        num = a;
        do
        {
            rem = a % 10;
            sum = sum + (rem * rem * rem);
            a = a / 10;
        }
        while (a>0);
        if(sum == num)
        {
            System.out.println(num+" is an armstrong no.");
        }
        else
        {
            System.out.println(num+" is not an armstrong no.");
        }
    }
}
