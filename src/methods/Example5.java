//non static method call from same class
package methods;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create object of class 
		//classname objectname=new classname
		System.out.println("main method is starting");
Example5 e4=new Example5();
e4.Ex1(); //objectname.methodname
e4.Ex2();
System.out.println("main method is ending");
	}
	public void Ex1()
	{
		System.out.println("this is the non static method");
	}
	public void Ex2()
	{
		System.out.println("it is a non static method of Ex2");
	}
	

}
