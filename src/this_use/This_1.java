package this_use;

public class This_1 extends Super1 {
static int a=10;
public static void main(String[] args) {
	This_1 ob=new This_1();
	ob.test();
}
public void test()
{int a=50;
	int sum=100+a+this.a+super.a;
	System.out.println(sum);
}
public static void test1()
{int a=90;
	int sum=50+this.a+super.a;//super /this keyword can't be used in static method
}
}
