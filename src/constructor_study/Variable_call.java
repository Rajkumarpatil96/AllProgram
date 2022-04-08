package constructor_study;

public class Variable_call {
	int a=10;//non static variable call
	static int b=23;//static variable
static String name="velocity";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Variable_call e=new Variable_call();
System.out.println("value of a is "+ e.a +"\n value of b is"+b +"\nname is "+name);
	}

}
