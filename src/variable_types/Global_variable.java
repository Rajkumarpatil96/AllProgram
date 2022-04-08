package variable_types;

public class Global_variable {
int a=10;//non static global variable
static int b=10;//static global variable

	public static void main(String[] args)
	{
		Global_variable ob=new Global_variable();//create object
		System.out.println("");
		test();
		ob.test1();
	
		V1 ob1=new V1();//object created to calling another class
		System.out.println("the value of x "+ob1.x );
		System.out.println("the value of y "+ob1.y);

	}
	public static void test()
	{
		int c=10;//local  static variable
		int sum=c+b;//adding local &global variable
		System.out.println("sum is "+sum);
	}
public   void test1()
{
	int c=15;
	int sum=c+a;
	System.out.println("sum is "+sum);
}
}
