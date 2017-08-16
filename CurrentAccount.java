package weekone;

public class CurrentAccount extends Account{

	public double intRate;
	public CurrentAccount(int a,String b,String c,double d)
	{
		super(a,b,c);
		balance=d;
		intRate=0.12;	//12% interest
		
	}
	@Override
	public double calculate()
	{
		return balance*intRate*1;    
	}
	@Override
	public String toString()
	{
		return String.format("Account number: "+Accno+"\nFirst name: "+firstname+"\nLast name: "+lastname+"\nAmount: "+balance+"\nInterest rate for 1 yr.: "+intRate+"\n");
	}
}
