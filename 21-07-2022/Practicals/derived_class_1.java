package practicals_21_07_2022;
import java.util.*;;
public class derived_class_1 extends base_class_1 
{
	Scanner sc = new Scanner(System.in);
	String c_name,b_name;
	int total=500,credit,debit,ch,pin=9654;
	long phone,account;
	char c;
	public void accept()
	{
		System.out.println("Enter the candidate name:");
		c_name=sc.nextLine();
		System.out.println("Enter the phone number of the candidate:");
		phone=sc.nextLong();
		System.out.println("Enter the bank name:");
		b_name=sc.next();
		System.out.println("Enter the bank account number:");
		account=sc.nextLong();
		int temp=pin;
		System.out.println("Enter your pin:");
		pin=sc.nextInt();
		if(pin==temp)
		{
			do
			{
				System.out.println("Enter your action number 1.Credit 2.Debit:");
				ch=sc.nextInt();
				switch(ch)
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
						set_Total(total);
						break;
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
		System.out.println("\nCandidate name :"+c_name);
		System.out.println("Phone number :"+phone);
		System.out.println("Bank name :"+b_name);
		System.out.println("Account number :"+account);
		System.out.println("Total balance :"+get_Total());
	}
	public static void main(String[] args)
	{
		derived_class_1 obj = new derived_class_1();
		obj.accept();
		obj.display();
	}	
}
