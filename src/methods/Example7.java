// Non Static method using diff class
package methods;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.create object of same class syntax-->classname objectname=new classname
		Example7 e7=new Example7();//e7 is the object
		e7.m1();//callng to method m1 of same class.---   syntax---->objectname. methodname
		e7.m2();
		Example5 R2=new Example5();//create object of diff class
		R2.Ex1();
		Example_1.Sub1();//calling static method Sub1 in non static method		
		
	}
	public void m1()
	{
		int a=10;//variable declare & initialize
		int b=20;//variable declare & initialize
		 int sum=a+b;
		 System.out.println("sum is "+sum);
	}
	public void m2()
	{
		int a=20;//variable declare & initialize
		int b=21;//variable declare & initialize
		 int mul=a*b;
		 System.out.println("multiplication is "+mul);
	}
}
