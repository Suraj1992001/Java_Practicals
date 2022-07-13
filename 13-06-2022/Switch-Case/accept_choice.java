/*WAP To Accept Choice From User And Accordingly Display The Output
1:Even Odd
2:Square
3:Vowel Or Not
4:Greater Between Three No.*/
import java.util.*;                                                                     //Importing Scanner Class
public class accept_choice                                                              //Accept Choice Class
{
    public static void main(String args[])                                              //Main Class
    {
        Scanner sc = new Scanner(System.in);                                            //Creating Object For Scanner Class
        int ch;                                                                         //Declaring Variable
        System.out.println(" CHOICES");                                                 //Listing Choices
        System.out.println(" 1.Even Odd \n 2.Square \n 3.Vowel or Not \n 4.Greater Between Three No.");
        System.out.println("Enter your choice:");                                       //Taking Input
        ch = sc.nextInt();                                                              //Giving Input
        switch (ch)                                                                     //Using Switch Case
        {
            case 1:                                                                     //Using Cases
                   int num;
                   System.out.println("Enter A No.:");
                   num = sc.nextInt();
                   if (num == 0)                                                        //Using If - Else - If
                   {
                       System.out.println("The No. Is Neither Odd Nor Even Number");    //Displaying Output
                   }
                   else if (num % 2 == 0)
                   {
                       System.out.println("The No. Is Even Number");
                   }
                   else
                   {
                       System.out.println("The No. Is Odd Number");
                   }
                   break;                                                               //Using Break To Come Out From Loop
            case 2:
                   int a;
                   System.out.println("Enter A No.:");
                   a = sc.nextInt();
                   System.out.println("The Square of "+a+" is:"+a*a);
                   break;
            case 3:
                   char c;
                   System.out.println("Enter The Character:");
                   c = sc.next().charAt(0);
                   switch (c)                                                           //Using Switch Case Inside A Switch Case
                   {
                        case 'a':
                             System.out.println(ch+" is a Vowel");
                             break;
                        case 'e':
                             System.out.println(ch+" is a Vowel");
                             break;
                        case 'i':
                             System.out.println(ch+" is a Vowel");
                             break;
                        case 'o':
                             System.out.println(ch+" is a Vowel");
                             break;
                        case 'u':
                             System.out.println(ch+" is a Vowel");
                             break;
                        case 'A':
                             System.out.println(ch+" is a Vowel");
                             break;
                        case 'E':
                             System.out.println(ch+" is a Vowel");
                             break;
                        case 'I':
                             System.out.println(ch+" is a Vowel");
                             break;
                        case 'O':
                             System.out.println(ch+" is a Vowel");
                             break;
                        case 'U':
                             System.out.println(ch+" is a Vowel");
                             break;
                        default:
                             System.out.println(ch+" is not a Vowel");
                   }
                   break;
            case 4:int num1,num2,num3;
                 System.out.println("Enter The Three No.s:");
                 num1 = sc.nextInt();
                 num2 = sc.nextInt();
                 num3 = sc.nextInt();
                 if(num1>num2 && num1>num3)
                 {
                     System.out.println(num1+" is Greatest No.");
                 }
                 else if (num2>num3 && num2>num1)
                 {
                     System.out.println(num2+" is Greatest No.");
                 }
                 else
                 {
                     System.out.println(num3+" is Greatest No.");
                 }
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
