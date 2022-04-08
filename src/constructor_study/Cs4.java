package constructor_study;

public class Cs4 {
int a;
int b;
int c;

public Cs4(int num)
{
a=num;	
}
public Cs4(int num,int num1)
{
	a=num;
	b=num1;
}
public Cs4(int num,int num1,int num2)
{
	a=num;
	b=num1;
	c=num2;
	
}
	public static void main(String[] args) {
		//Cs4 c=new Cs4();
		//c.test();
		Cs4 d=new Cs4(10);
		d.test();
		Cs4 e=new Cs4(14,45);
		e.test();
		Cs4 f=new Cs4(12,12,45);
		f.test();
		

	}
public void test()
{
	int sum=a+b+c;
	System.out.println(""+sum);
}
}
