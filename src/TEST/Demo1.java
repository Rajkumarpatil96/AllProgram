package TEST;

import access_specifier.AS3;

public class Demo1 extends AS3{

	public static void main(String[] args) {
		Demo1 v=new Demo1();
		v.sample();
		v.sample1();
System.out.println("public variable is"+v.a);
System.out.println("protected variable is "+v.b);
	}

}
