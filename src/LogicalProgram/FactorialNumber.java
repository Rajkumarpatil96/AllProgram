package LogicalProgram;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		//5!=5*4*3*2*1
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		//int num=5;
		int fact = 1;
		for(int i=num;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
