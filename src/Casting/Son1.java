package Casting;

public class Son1 extends father1{

	public static void main(String[] args) {
		Son1 c=new Son1();
		c.property();
		c.money();
		//father1 f=new father1();
		//f.property();
		//f.money();
	father1 f1=new Son1();
	f1.property();
	f1.money();
	//Son1 d= (Son1) new father1();
	//d.money();
				
	}
public void  property()
{
	System.out.println("sons property");
}
public void money()
{
	System.out.println("sons money 10000");
}
}