package polymorphism_Study;

public class Mother1 extends Father1 {
	int a=30;
	int b=40;
public void add()
{int sum=a+b;

	System.out.println(sum);
}
public void mul()
{
	int mul=a*b;
	System.out.println("multiplication is "+mul);
}
}
