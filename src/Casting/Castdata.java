package Casting;

public class Castdata {

	public static void main(String[] args) {

//implicit casting--->lower datatype of imformation is converted into higher data type of imformation is called the implicit casting
int a=10;
System.out.println("value of a is"+a);
double b=a;
System.out.println("value of b is "+b);

//Explicit casting-->higher datatype of imformation is converted into lower data type of imformation is called the Explicit casting
double c=10.12345;
System.out.println("value of c is "+c);
int d=(int) c;
System.out.println("value of d is "+d);
	}

}
