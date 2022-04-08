package methods;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		parameter1(21,45,12);
		Example11 ob=new Example11();
		ob.parameter2("Raj", 'A', 62.5f, 70);
		ob.parameter2("kishor", 'A', 66.65f, 65);
	}
	public static void parameter1(int a,int b, int c )//static e1 method with patameter
	{
		
		int sum=a+b+c;
		System.out.println("sum is "+ sum);
	}
public void parameter2(String name,char grade,float weight,int marks)
{
	System.out.println("name is "+ name);
	System.out.println("grade is "+ grade);
	System.out.println("weight is "+ weight);
	System.out.println("marks is "+ marks);
	
	}
}

