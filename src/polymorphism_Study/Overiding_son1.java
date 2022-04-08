package polymorphism_Study;

public class Overiding_son1 extends Mother1{
 int a=10;
 int b=50;
	public static void main(String[] args) {
		Overiding_son1 v=new Overiding_son1();
				
		v.add();
		Mother1 c=new Mother1();
		
		
		c.add();
		c.mul();
		Father1 d=new Father1();
		d.add();
		d.mul();
		System.out.println("calling globle variable from father1 class"+d.a);
		System.out.println("calling globle variable from father1 class"+d.b);
		System.out.println("calling globle variable from mother1 class"+c.a);
		System.out.println("calling globle variable from mother1 class"+c.b);
		System.out.println("calling globle variable from Overiding_son1 class"+v.a);
		System.out.println("calling globle variable from Overiding_son1 class"+v.b);
	}
public  void add()
{
	int sum=a+b;
	System.out.println("overriding son class"+sum );
}

}