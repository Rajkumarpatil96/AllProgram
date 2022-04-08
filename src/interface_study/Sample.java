package interface_study;

public interface Sample {
default void test()
{
	int a=30;
	int b=30;
	int sum=a+b;
	System.out.println(""+sum);
}
default void test1()
{
	float a=30;
	float d=40.12f;
	float sum=a+d;
	System.out.println(""+sum);
}
}
