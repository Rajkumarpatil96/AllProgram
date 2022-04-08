package abstract_study;

public abstract  class Abstract {

	public static void main(String[] args) {
		//Abstract s=new Abstract();//object cant create in Abstract class
		test1();
	}
public void test() {
	System.out.println("This is the complete method ");
}
public static void test1()
{
	System.out.println("This is the static method ");
}
public abstract  void test2(int a,int b);//incomplete method of Abstract class
public abstract void test3();
}
