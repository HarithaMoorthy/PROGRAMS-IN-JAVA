package weekone;
public class Rational {
	private double N;
	private double D;
	Rational()
	{
		N=0.0;
		D=1.0;
	}
	Rational(double a,double b)
	{
		this.N=a;
		this.D=b;
	}
	public void Add(Rational R1,Rational R2)
	{
		D=gcd(R1.D,R2.D);
		D = (R1.D*R2.D) / D;
		N = (R1.N)*(D/R1.D) + (R2.N)*(D/R2.D);
		lowest(D,N);
	}
	double gcd(double a,double b)
	{
		if (a == 0)
			return b;
		return gcd(b%a, a);
	}
	public void lowest(double D,double N)
	{
		double c= gcd(N,D);
		this.D=D/c;
		this.N=N/c;
	}
	
	public void Sub(Rational R1,Rational R2)
	{
		D=gcd(R1.D,R2.D);
		D = (R1.D*R2.D) / D;
		N = (R1.N)*(D/R1.D) - (R2.N)*(D/R2.D);
		lowest(D,N);
	}
	public String toString()
	{
		return String.format(N+"/"+D);
	}

}
 