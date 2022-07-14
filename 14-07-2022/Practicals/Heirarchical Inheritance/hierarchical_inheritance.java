package practicals_14_07_2022;
public class hierarchical_inheritance
{
	public static void main(String[] args) 
	{
		addition a = new addition();
		a.accept();
		a.plus();
		subtraction s = new subtraction();
		s.accept();
		s.minus();
		multiplication m = new multiplication();
		m.accept();
		m.multiply();
		division d = new division();
		d.accept();
		d.divide();
		modulus r = new modulus();
		r.accept();
		r.rem();
	}
}
