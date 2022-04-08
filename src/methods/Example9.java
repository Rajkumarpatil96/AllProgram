package methods;
import java.util.Scanner;
public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example9.k();
	}
	public static void k()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the value in inch");
		float a=Sc.nextFloat();
		System.out.println("enter the value in inch");
		float b =Sc.nextFloat();
		double sum =a+b;
		

		System.out.println("sum is "+ sum);
			double c=sum / 39.37;
			System.out.println("ans is in meters"+c);
	}

}
