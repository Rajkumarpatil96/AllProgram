//Non static method using same class
package methods;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(("this is the non static method from class Example6"));
Example6 e6=new Example6();//create object of same class
e6.m1();//calling of method m1 of same class (syntax-objectname.methodname);
e6.m2();//calling of method m2 of same class (syntax-objectbname.methodname);
	}
	public void m1()//method definition
	{
		int num=500;
		float value=80.70f;
		double mul=num*value;
		System.out.println("multiplication is "+mul);
		
	}
	public void m2()//method definition
	{
		String varification=" it is starting method .\n it is a review process.\n it can gathered imformartion review then designed code is ok can be review & then \n go to devloper can  creat code ios ok it can be rewied\n this process is verification process.\n it is also known as static process&quality assurance. ";
		System.out.println("verification is"+ varification);
	}

}
