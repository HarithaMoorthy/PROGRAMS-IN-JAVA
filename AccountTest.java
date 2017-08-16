package weekone;

public class AccountTest{
	public static void main(String[] args)
	{
		SavingsAccount S=new SavingsAccount(253,"Risab","Thilak",7000);
		double d=S.calculate();
		System.out.println(S);
		System.out.printf("  Savings acc. :\nBalance=%.2f\nInterest=%.2f\n\n",S.balance-d,d);
		CurrentAccount C=new CurrentAccount(1002,"Vimal","Kumar",50000);
		double f=C.calculate();
		System.out.println(C);
		System.out.printf("  Current acc. :\nBalance:%.2f\ninterest: %.2f",C.balance-f,f);
	}

}
