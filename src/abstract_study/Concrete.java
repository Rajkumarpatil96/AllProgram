package abstract_study;

public class Concrete extends Abstract {

	public static void main(String[] args) {
Concrete c=new Concrete();
c.test2(12,24);
test1();
c.test();
c.test2();
c.test3();
	}
	
	public void test2() {
		// int a=10;
		System.out.println("hhh\n kkk");
		
	}

	@Override
	public void test2(int a, int b) {
		// TODO Auto-generated method stub
		int sum=a+b;
		System.out.println("sum is "+sum);
	}

	
	public void test3() {
		System.out.println("zero parameter");
		
	}
	
}
	