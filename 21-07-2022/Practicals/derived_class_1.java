/*WAP To Accept Candidate Name, Bank Name, Phone Number, Account Number From User And By Encapsulation Make Balance And Pin Private 
And Take Default Balance=500 And Take Credit Amount And Debit Amount From User And Display The Details If The Pin Is Correct*/
package practicals_21_07_2022;						//Creating A Package
import java.util.*;							//Importing Scanner Class	
public class derived_class_1 extends base_class_1 			//Sub Class Inherit Super Class
{
	Scanner sc = new Scanner(System.in);				//An Object Of Scanner Class Is Created
	String c_name,b_name;						//Variable Declaration
	int total=500,credit,debit,ch,pin,temp;
	long phone,account;
	char c;
	public void accept()						//Creating Method
	{
		System.out.println("Enter the candidate name:");	//Taking Input
		c_name=sc.nextLine();					//Giving Input
		System.out.println("Enter the phone number of the candidate:");
		phone=sc.nextLong();
		System.out.println("Enter the bank name:");
		b_name=sc.next();
		System.out.println("Enter the bank account number:");
		account=sc.nextLong();
		temp=pin;						//Assigning A Value To A Variable
		System.out.println("Enter your pin:");
		pin=sc.nextInt();
		get_Pin();						//Calling 'get' Method Of Super Class
		if(pin==temp)						//Using 'if-else' Statement 
		{
			do						//Using 'do-while' Loop
			{
				System.out.println("Enter your action number 1.Credit 2.Debit:");
				ch=sc.nextInt();
				switch(ch)				//Using 'switch-case' Statement
				{
				case 1:	System.out.println("Enter the amount you want to credit:");
						credit=sc.nextInt();
						if(credit>500)
						{
							System.out.println("You don't have sufficient balance to credit.");
						}
						else
						{
							total -= credit;
							System.out.println("Amount Credited.");
						}
						set_Total(total);	//calling set method of super class
						break;			//break statement to send the control outside the loop 
				case 2:	System.out.println("Enter the amount you want to debit:");
						debit=sc.nextInt();
						total += debit;
						System.out.println("Amount Debited.");
						set_Total(total);
						break;
				}
				System.out.println("Do you want to continue:");
				c=sc.next().charAt(0);
			}
			while(c=='y');
		}
		else
		{
			System.out.println("We cannot process because your pin is incorrect.");
		}
	}
	public void display()
	{
		if(pin==temp)
		{
			System.out.println("\nCandidate name :"+c_name);
			System.out.println("Phone number :"+phone);
			System.out.println("Bank name :"+b_name);
			System.out.println("Account number :"+account);
			System.out.println("Total balance :"+get_Total());
		}
		else
		{
			System.out.println("Sorry we have nothing to display to you.");
		}
	}
	public static void main(String[] args)				//main class
	{
		derived_class_1 obj = new derived_class_1();		//creating object for sub class
		obj.accept();						//calling  method
		obj.display();
	}	
}
