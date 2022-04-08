package polymorphism_Study;

public class Overloading {

	public static void main(String[] args) {
		Overloading v=new Overloading();
		v.add();
		v.add(12, 20);
		v.add(14, 15, 10);
		v.add(12.12f, 14.14f);

	}
public void add()
{
	int a=20;
	int b=20;
	int sum=a+b;
	System.out.println("sum is "+sum);
}
public void add(int a,int b)
{
	int sum=a+b;
	System.out.println("sum of the method with two parameter is "+ sum);
	
}
public void add(int a,int b, int c)
{
	int sum=a+b+c;
	System.out.println("sum of add  method with three parameter is "+ sum);
}
public void add(float a,float b)
{
	float sum =a+b;
	System.out.println("sum of method with two float parameter is "+ sum);
}
}
