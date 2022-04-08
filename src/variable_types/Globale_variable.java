package variable_types;

public class Globale_variable {
int a=10;//globle non static variable
static int b=20;//globale static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Globale_variable ob=new Globale_variable();
System.out.println("non static globale variable is "+ob.a);
System.out.println("static globale variable is "+b);
ob.test();
test1();
	}
public void test()
{
	int c=a+b;//in non static method we can give the static &non static globale  variable it can be easily  run
	System.out.println("sum is "+c);
	
}
public static void test1()
{
	int c=100;
	int sum=b+c;//In static method we cannot give any non static globale variable static method can't read the non static globale variable .they will give the error .
	System.out.println("sum is "+sum);
}
}
