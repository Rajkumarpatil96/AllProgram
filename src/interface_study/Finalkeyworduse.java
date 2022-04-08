package interface_study;

public class Finalkeyworduse {
int a=20;
 final int b=30;
	public static void main(String[] args) {
		Finalkeyworduse c=new Finalkeyworduse();
		c.test();
				
	}
public  void test()
{int a=10;

	 b=a+b;//if there is no final keyword there will be value of b is updated
	 System.out.println("updated value of b is"+b);
	//b=a+b;
	System.out.println(""+b);
}


}
