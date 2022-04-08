package this_use;

public class This_study {
int a=20;
int b=100;
static int c=200;
	public static void main(String[] args) {
		This_study T=new This_study();
		T.sample();
sample1();
	}
public void sample()
{
	int a=20;
	int sum=100+a;//using local variable
	System.out.println("sum of local variable "+sum);
	int sum1=10+this.a;//using global variable
	System.out.println("sum of global variable a is"+ sum1);
}
public static void sample1()
{int c=50;
//int sum3=100+this.c;//cant use this keyword in static method
int sum3=100+c;
	System.out.println("sum of the sum3 is "+sum3);
}
}
