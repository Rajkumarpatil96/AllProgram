package TEST;//calling AS1 class public and protected access specifier scope access in another package

import access_specifier.AS1;

public class Demo extends AS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo ob=new Demo();//created object of AS1 class
ob.test();//calling public method of AS1 class
ob.test2();
//Demo D=new Demo();
//D.test();
//D.test2();
System.out.println("public global variable is "+ob.b);//calling public variable of AS1 class
System.out.println("PROTECTED GLOBAL VARIABLE IS "+ob.c);
	}

}
