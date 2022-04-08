//static method using diff class.
package methods;

public class Example4 {
	public static void main(String[] args) {
		String manual;
		manual="imformation all about project planning & it is work";
		System.out.println("manual testing is "+ manual);
		range2();//calling sttic method range 2of same class
		
		range3();//calling static method range3 of same class
		//range1();
		Example_1.Sub4();//calling static method Sub4 of another class Example_1(syntax-classname.methodname();
		Example3.Ex2();//calling static method Ex2 of another class Example3(syntax-classname.methodname();

		range1();//calling static method range1 of same class
	
	
		
	}
public static void range1()
	{
		int a=1000;
		float b=3115;
		 double multiplication=a*b;
		 System.out.println("multiplication of  double is "+ multiplication);
	
	}
	public static void range2()
	{
	  String varification=" it is starting method .\n it is a review process.\n it can gathered imformartion review then designed code is ok can be review & then \n go to devloper can  creat code ios ok it can be rewied\n this process is verification process.\n it is also known as static process&quality assurance. ";
	System.out.println("verification is"+ varification);
	}
	public static void range3()
	{
	String validation=("validation is the ending process & these process tester can be involved \n it is also called as dynamic process or quality control.");
	System.out.println(""+validation);
	}

}
