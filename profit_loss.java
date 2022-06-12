//WAP To Accept Selling Price And Cost Price Of An Item And Find Out Profit Or Loss
import java.util.*;                                                 //Importing Scanner Class
public class profit_loss                                            //Profit And Loss Class
{
    public static void main(String args[])                          //Main Class
    {
        Scanner sc = new Scanner(System.in);                        //Creating Object For Scanner Class
        int sp,cp,profit,loss;                                      //Declaring Variables
        System.out.println("Enter The Selling Price Of An Item:");  //Taking Input
        sp = sc.nextInt();                                          //Giving Output
        System.out.println("Enter The Cost Price Of An Item:");
        cp = sc.nextInt();
        if (sp>cp)                                                  //Using If - Else - If Statement
        {
            profit = sp - cp;                                       //Performing Function
            System.out.println("Profit On The Item:"+profit);       //Displaying Output
        }
        else if(cp>sp)
        {
            loss = cp - sp;
            System.out.println("Loss On The Item:"+loss);
        }
        else
        {
            System.out.println("Neither Profit Nor Loss");
        }
    }
}
