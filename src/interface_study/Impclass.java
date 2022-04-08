package interface_study;

public class Impclass implements Myinterface{
//one class can implement the interface
	public static void main(String[] args) {
		Impclass v=new Impclass();
				v.m1();
		v.m2();
		v.test3();
System.out.println(a);
	}

	@Override
	public void m1() //providing defination to incomplete method from interface 
	{
		
		System.out.println("method m1 is completed in impementation class");
	}

	@Override
	public void m2() {
		System.out.println("method m2 complete in implementation class");
		
	}
protected void test3()
{
	System.out.println("own method of implementation class");
}
}
