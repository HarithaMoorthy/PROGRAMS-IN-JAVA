package weekone;

public class RationalTest {
	public static void main(String[] args) {
	Rational R1=new Rational(2.0,11.0);
	Rational R2=new Rational(4.0,9.0);
	Rational R3=new Rational();
	Rational R4=new Rational();
	R3.Add(R1, R2);
	R4.Sub(R1, R2);
	System.out.println("("+R1+")+("+R2+")=("+R3+")");
	System.out.println("("+R1+")-("+R2+")=("+R4+")");
	}

}
