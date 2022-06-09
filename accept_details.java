/*WAP To Accept Student Name,Roll No. And Marks Of 5 Subjects
And Then Calculate Percentage And Display The Output*/
import java.util.*; //Importing Scanner Class
public class accept_details //Name Of The Class
{
    public static void main(String args[]) //Main Method
    {
        String name; //Declaring name Variable
        int roll_no,m1,m2,m3,m4,m5; //Declaring roll no. and marks of 5 subject variables
        float percent; //Declaring percent Variable
        Scanner sc = new Scanner(System.in); //Allow To Take Input
        System.out.println("Enter Your Name:"); //Taking Input
        name = sc.nextLine(); //Giving Input
        System.out.println("Enter Your Roll No. :");
        roll_no = sc.nextInt();
        System.out.println("Enter Your Marks of 1st Subject :");
        m1 = sc.nextInt();
        System.out.println("Enter Your Marks of 2nd Subject :");
        m2 = sc.nextInt();
        System.out.println("Enter Your Marks of 3rd Subject :");
        m3 = sc.nextInt();
        System.out.println("Enter Your Marks of 4th Subject :");
        m4 = sc.nextInt();
        System.out.println("Enter Your Marks of 5th Subject :");
        m5 = sc.nextInt();
        percent = ((m1+m2+m3+m4+m5)*100)/500F; //Calculating percentage
        System.out.println("Name :"+name); //Displaying Output
        System.out.println("Roll No. :"+roll_no);
        System.out.println("Marks of 1st Subject:"+m1);
        System.out.println("Marks of 2nd Subject:"+m2);
        System.out.println("Marks of 3rd Subject:"+m3);
        System.out.println("Marks of 4th Subject:"+m4);
        System.out.println("Marks of 5th Subject:"+m5);
        System.out.println("Percentage of marks:"+percent);
    }
}
