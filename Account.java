package weekone;

public class Account {
	public int Accno;
	public String firstname;
	public String lastname;
	public double balance;
	Account()
	{
	}
	public Account(int n,String c,String d)
	{
		Accno=n;
		firstname=c;
		lastname=d;
		balance=10000;
	}
	
	public double calculate()
	{
		return 0.0;
	}
	public String toString()
	{
		return String.format(Accno+"\n"+firstname+"\n"+lastname+"\n"+balance);
	}

}
