package access_specifier;

public class AS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AS1 ob=new AS1();
ob.test();//public method of AS1 class
ob.test1();//default method of AS1 class
ob.test2();//protected method of AS1 class
//ob.test3();-->private members are visible in class
System.out.println("calling default global variable is "+ob.a);
System.out.println("calling public global variable is "+ob.b);
System.out.println(" calling protected global variable is "+ob.c);

	}

}
