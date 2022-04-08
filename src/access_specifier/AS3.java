package access_specifier;

public class AS3 {
	public int a=10;
	protected int b=20;
	int c=30;
	private int d=40;
public static void main(String[] args) {
	AS3 ob=new AS3();
	ob.sample();
	ob.sample1();
	ob.sample2();
	ob.sample3();
	System.out.println("public variable is "+ob.a);
	System.out.println("protected variable is "+ob.b);
	System.out.println("default variable is"+ob.c);
	System.out.println("private variable is "+ob.d);
}
public void sample()
{
	int sum=a+b;
	System.out.println(""+sum);
}
protected void sample1()
{
	int sum=b+a;
	System.out.println(""+sum);
	
}
void sample2()
{
	int sum=b+c;
	System.out.println(""+sum);
}
private void sample3()
{
	int sum=d+c;
	System.out.println(""+sum);
}
}
