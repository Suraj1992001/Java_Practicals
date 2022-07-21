/*WAP To Accept Candidate Name, Bank Name, Phone Number, Account Number From User And By Encapsulation Make Balance And Pin Private 
And Take Default Balance=500 And Take Credit Amount And Debit Amount From User And Display The Details If The Pin Is Correct*/
package practicals_21_07_2022;			//Creating A Package
public class base_class_1 			//Creating Super Class
{
	private int Total,Pin;			//Variable Declaration Privately
	public void set_Total(int newval)	//'set' Method
	{
		Total=newval;			//Assigning A Value To A Variable
	}
	public int get_Total()			//'get' Method
	{
		return Total;			//Return Value
	}
	public void set_Pin(int newval)
	{
		Pin=9654;
	}
	public int get_Pin()
	{
		return Pin;
	}
}
