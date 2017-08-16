package weekone;

public class SavingsAccount extends Account {
	public double intRate;
	public SavingsAccount(int a,String f,String l,double d)
	{
		super(a,f,l);
		balance=d;
		intRate=0.05;	//5% interest
	
	}
/*	public void func()//to know about the use of keyword 'super'
	{
		super.calculate();
		System.out.println(this);
	}
	*/
@Override
	public double calculate()
	{
		double interest;
		interest=balance*intRate*1; //for 1 year
		return interest;
	}
	@Override
	public String toString()
	{
		return String.format("Account number: "+Accno+"\nFirst name: "+firstname+"\nLast name: "+lastname+"\nAmount: "+balance+"\nInterest rate for 1 yr.: "+intRate+"\n");
	}
	
}
