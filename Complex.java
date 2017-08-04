package weekone;

public class Complex {
	public int Real;
	public int Imag;
	Complex()
	{
	}
	Complex(int R,int I)
	{
		Real=R;
		Imag=I;
	}
	public void Add(Complex C1,Complex C2)
	{
		Real=C1.Real+C2.Real;
		Imag=C1.Imag+C2.Imag;	
	}
	public void Sub(Complex C1,Complex C2)
	{
		Real=C1.Real-C2.Real;
		Imag=C1.Imag-C2.Imag;
	}
	@Override
	public String toString()
	{
		return String.format("("+Real+")+i("+Imag+")");
	}
	
}
