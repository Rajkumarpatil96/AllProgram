package constructor_study;

public class Cs1 {
int a; int b; int c;//global variable variable declaration
public Cs1()
{
a=100;
b=200;
c=300;
System.out.println("this zero parameter constructor");
}
public  Cs1(int num,int num1)
{
	a=num1;
	
	b=num1;
	System.out.println("this is two parameter constructor ");
}
public Cs1(int num,int  num1,int num2 )
{
	a=num;
	b=num1;
	
	c=num2;
	System.out.println("this three parameter constructor");
}
	public static void main(String[] args) {
	
Cs1 ob=new Cs1();
ob.met();
Cs1 obj=new Cs1(12,12);
obj.met();
Cs1 ob1=new Cs1(45,45,10);
ob1.met();

	}
	public  void met()
	{
		
	int  sum=a+b+c;
	System.out.println("sum is "+sum);


	}

}
