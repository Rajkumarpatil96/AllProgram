package LogicalProgram;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a&b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a+b;
		System.out.println("Sumof a&b is"+sum);
		System.out.println("enter the float value");
		float c = sc.nextFloat();
		float d = sc.nextFloat();
		float value = c+d;
		System.out.println("Float values are"+value);
		

	}

}
