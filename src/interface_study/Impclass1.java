package interface_study;

public class Impclass1 implements Myinterface1 {

	public static void main(String[] args) {
		Impclass1 v=new Impclass1();
		v.m1();
		v.m2();
		v.test();
		v.test1();
	}

	@Override
	public void m1() {
		System.out.println("incomplete method m1 of Myinterface ");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("incomplete method m2 of Myinterface");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("incomplete method test of Myinterface 1");
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("incomplete method test1 of myinterface1");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("incomplete method test2 of Myinterface");
	}

}
