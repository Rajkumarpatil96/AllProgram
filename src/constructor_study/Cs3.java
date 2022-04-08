package constructor_study;

public class Cs3 {
static int a=14;
float b=40;//non static global variable
String name;
public Cs3()

{
	int a=50;
	int b=40;
	int c=a+b;
	System.out.println("sum is "+c);
}
public Cs3(int num,float num1)
{
	a=num;
	b=num1;
}
public Cs3(float num1,String name1)
{
	b=num1;
	
	//System.out.println("name is "+name);
	System.out.println("value of b is "+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cs3 obj=new Cs3();
obj.test();
Cs3 obj1=new Cs3(45,41.14f);
obj1.test();
Cs3 obj2=new Cs3(12.12f,"Rajkumar");
obj2.test();




	}
	public void test()
	{
		float c=a+b;
		System.out.println("float value is "+c);
		
		
		
	}
	

}
