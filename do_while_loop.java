//WAP To Perform Do While Loop And Nested Switch Case
import java.util.*;                                                             //Importing Scanner Class
public class do_while_loop                                                      //Do While Loop Class
{
    public static void main(String args[])                                      //Main Class
    {
        Scanner sc = new Scanner(System.in);                                    //Creating Object For Scanner Class
        int ch,ch1,ch2,ch3,total=0;                                             //Declaring Variables
        char ans;
        System.out.println(" XYZ Hotel");                                       //Printing Statement
        do                                                                      //Using Do While Loop
        {
            System.out.println(" 1.STARTERS \n 2.MENU \n 3.DESERTS");           //Displaying Choices
            System.out.println("Enter your choice:");                           //Taking Input
            ch = sc.nextInt();                                                  //Giving Input
            switch (ch)                                                         //Using Switch Case
            {
                case 1:                                                         //Using Cases
                    System.out.println(" STARTERS");
                    System.out.println(" 1.S1  RS.100 \n 2.S2  RS.150 \n 3.S3  RS.200");
                    System.out.println("Enter your choice:");
                    ch1 = sc.nextInt();
                    switch (ch1)
                    {
                        case 1: total += 100;                                   //Performing Function
                                System.out.println("The Bill is: RS"+total);    //Displaying Output
                                break;                                          //Using Break To Come Out From Loop
                        case 2: total += 150;
                                System.out.println("The Bill is: RS"+total);
                                break;
                        case 3: total += 200;
                                System.out.println("The Bill is: RS"+total);
                                break;
                        default:
                                System.out.println("Invalid Choice");
                    }
                case 2:
                    System.out.println(" MENU");
                    System.out.println(" 1.M1  RS.200 \n 2.M2  RS.300 \n 3.M3  RS.400");
                    System.out.println("Enter your choice:");
                    ch2 = sc.nextInt();
                    switch(ch2)
                    {
                        case 1: total += 200;
                                System.out.println("The Bill is: RS"+total);
                                break;
                        case 2: total += 300;
                                System.out.println("The Bill is: RS"+total);
                                break;
                        case 3: total += 400;
                                System.out.println("The Bill is: RS"+total);
                                break;
                        default:
                                System.out.println("Invalid Choice");
                    }
                case 3:
                    System.out.println(" DESERTS");
                    System.out.println(" 1.D1  RS.50 \n 2.D2  RS.60 \n 3.D3  RS.70");
                    System.out.println("Enter your choice:");
                    ch3 = sc.nextInt();
                    switch (ch3)
                    {
                        case 1: total += 50;
                            System.out.println("The Bill is: RS"+total);
                            break;
                        case 2: total += 60;
                            System.out.println("The Bill is: RS"+total);
                            break;
                        case 3: total += 70;
                            System.out.println("The Bill is: RS"+total);
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }
            }
            System.out.println("Do You Want to Continue?");
            ans = sc.next().charAt(0);
        }
        while (ans == 'y' || ans == 'Y');                                       //Putting Condition In Do While Loop
        System.out.println("Thank You For Coming");

    }
}
