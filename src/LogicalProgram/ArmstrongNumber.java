package LogicalProgram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//153=1^3+5^3+3^3;
		int armstrong=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		 int z = num;
		
		for(;z>0;z=z/10)
		{
			int remainder = z%10;
			armstrong=armstrong+(remainder*remainder*remainder);
		}
		//System.out.println(armstrong);
		if(num==armstrong)
		{
			System.out.println("Given number is Armstrong number");
		}
//		else
//		{
//			System.out.println("Given number is not Armstrong");
//		}
	}

}
