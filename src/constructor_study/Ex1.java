package constructor_study;

public class Ex1 {
	public Ex1()//zero parameter constructor by user defined
	{
		int a=20;
		int b=40;
		
	System.out.println("value of a is "+a +"\nvalue of b is "+b);
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ex1 c=new Ex1();//create object same class
c.add(45, 12);//calling non static with parameter 
	}
	public void add(int a,int  b)//(non static method with parameter
	{
	int sum	=a+b;
	System.out.println("sum is "+sum);
	}

}
