package polymorphism_Study;

public class Overload {

	public static void main(String[] args) {
		Overload c=new Overload();
		c.add();
		c.add(11.11f,12.17f );
		c.add(11);
		add(11,12,13);


	}
public void add()
{int a=20;
int sum=100+a;
System.out.println(sum);
	
}
public void add(int a)
{
	int sum=10+a;
	System.out.println("sum of one parameter methiod is"+sum);
}
public void add(float a,float b)
{
	float mul=a*b;
	System.out.println("multiplication of two parameters"+mul);
}
public static void add(int a,int b,int c)
 {
	int div=a*b/c;
	System.out.println("division of add with three parameter is "+div);
 }
}
