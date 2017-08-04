package weekone;

public class ComplexTest {
	public static void main(String [] args)
	{
	Complex C1=new Complex(2,7);
	Complex C2=new Complex(3,8);
	Complex C3=new Complex();
	Complex C4=new Complex();
	C3.Add(C1, C2);
	C4.Sub(C1,C2);
	System.out.println(C3);
	System.out.println(C4);
	}

}
