//non static method using same class
package methods;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example10 s6=new Example10();
		s6.g1();
		s6.g2();
	}
	public  void g1()
	{
		long num=131553682656l;
		String name="keshav";
		int sum =1000;
		System.out.println("display the "+num);
		System.out.println("name "+name);
		System.out.println("sum"+sum);
	}
	public void g2()
	{
		int i;	int counter ;
	
		i=654;
		counter=76;
		
		System.out.println("counter"+counter);
		System.out.println(""+i);
		
		}
		
}

