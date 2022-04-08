package access_specifier;

public class AS1 {
int a=10;//default global variable
public int b=20;//public global variable
protected   int c=30;//protected global variable
private int d=40;//private global variable
	public static void main(String[] args) {
	AS1 ob=new AS1();
	ob.test();
	ob.test1();
	ob.test2();
	ob.test3();
System.out.println("DEFAULT GLOBAL VARIABLE IS A"+ob.a);
System.out.println("public global variable is b"+ob.b);
	}
public void test()
{
	System.out.println("This is a public access specifier Method. Scope of the public specifier is throughout the PROJECT");
}
void test1() {
	System.out.println(" this is the default acces specifier method .scope of default is throghout the PACKAGE.Can't accessed outside of package ");
}
protected void test2()
{
	System.out.println("this is the protected access specifier method  . Scope of the protected is throughout the PACKAGE . Can we use the outside the package INHERITANCE PRINCIPLE.  ");
}
private void test3()
{
	System.out.println("This is the private method .Scope of the these method is inside the class");
}
}
