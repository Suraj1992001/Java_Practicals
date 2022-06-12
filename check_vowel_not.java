//WAP To Accept A Character From User And Check It Is Vowel Or Not Using Switch Case
import java.util.*;                                 //Importing Scanner Class
public class check_vowel_not                        //Checking Vowel Or Not Class
{
    public static void main(String args[])          //Main Class
    {
        Scanner sc = new Scanner(System.in);        //Creating Object For Scanner Class
        char ch;                                    //Declaring Variable
        System.out.println("Enter Any Character:"); //Taking Input
        ch = sc.next().charAt(0);                   //Giving Input
        switch (ch)                                 //Applying Switch Case
        {
            case 'a' :                              //Checking Vowel Or Not
                System.out.println("It Is A Vowel");//Printing The Result
                break;                              //Using Break To Come Out From Loop
            case 'e' :
                System.out.println("It Is A Vowel");
                break;
            case 'i' :
                System.out.println("It Is A Vowel");
                break;
            case 'o' :
                System.out.println("It Is A Vowel");
                break;
            case 'u' :
                System.out.println("It Is A Vowel");
                break;
            case 'A' :
                System.out.println("It Is A Vowel");
                break;
            case 'E' :
                System.out.println("It Is A Vowel");
                break;
            case 'I' :
                System.out.println("It Is A Vowel");
                break;
            case 'O' :
                System.out.println("It Is A Vowel");
                break;
            case 'U' :
                System.out.println("It Is A Vowel");
                break;
            default:                                    //Unexpected Case
                System.out.println("It Is Not A Vowel");
        }

    }
}
