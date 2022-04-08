//USING STATIC METHOD CALL FROM ANOTHER CLASS
package methods;

public class Example3 {
	public static void Ex2()//defining static method
	{
		System.out.println("this is static method from class Example 3");
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("this is main method of class Example 1");
Ex1();//static method call from same class
//Ex2();
//classname.methodname--->To call static method from another class
Example_1.Sub3();
	}
	public static void Ex1()//defining static method
	{
		System.out.println("this is static method of class Example 3");
	}

}
