package constructor_study;

public class TEST {
	int a;
	int b;
	int c;
	public TEST(int num1,int num2)
	{
		a=num1;
		b=num2;
		
	}
public TEST(int num1,int num2,int num3)
{
	a=num1;
	b=num2;
	c=num3;
}

	public static void main(String[] args) {
		TEST T=new TEST(10,20);
		T.Cont();
		TEST k=new TEST(10,20,30);
		k.Cont();
	}
	public void Cont()
	{
		int sum=a+b+c;
		System.out.println(""+sum);
	}
}
