package constructor_study;

public class Cs2 {
	int a;// variable declaration  (Global variable)
	int b;//variable declaration (Global variable)
	int c;//variable declaration  (Global variable)
	int d;
	public Cs2()//zero parameter constructor
	{
		a=100;
		b=200;
		c=300;
		d=400;
	}
	public Cs2(int num1)//one parameter constructor

	{
		a=num1;
		System.out.println("this is the zero parameter constructer");
	}
	public Cs2(int num1, int num2,int num3)//three parameter constructor
	{
	a=num1;
	b=num2;
	c=num3;
	System.out.println("this is three parameter constructor");
	}
	public Cs2(int num1,int num2,int num3,int num4)
	{
		a=num1;
		b=num2;
		c=num3;
		d=num4;
		System.out.println("this is the four parameter constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cs2 obj= new Cs2();
obj.sub();
Cs2 obj1=new Cs2(454);
obj1.sub();
Cs2 obj2=new Cs2(45,45,10);
obj2.sub();
Cs2 obj3=new Cs2(12,12,12);
obj3.sub();

	}
	public void sub()
	{
		int sub=a-b-c-d;
		System.out.println("substraction is "+sub);
	}

}
