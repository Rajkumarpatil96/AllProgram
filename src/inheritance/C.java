package inheritance;

public class C extends B {// multilevel inheritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C ob=new C();
ob.scooty();//calling property of super class
ob.exprience();//calling property of supermost class
ob.Watch();//calling property of own class
mobile();//calling property of super class
nature();//calling property of supermost class
bike();//calling property of own class

	}
public static void  bike()
{
	System.out.println("Class C bike ");
}
public void Watch()
{
	System.out.println("Class C Watch");
}
}
