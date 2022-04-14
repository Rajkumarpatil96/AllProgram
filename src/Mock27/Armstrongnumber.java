package Mock27;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		//153--->1^3+5^3+3^3//armstrong num is nuthing but
		int armstrong=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		//int num=25;int armstrong=0;
		for(int i=num;i>0;i=i/10)
		{
			int remainder = i%10;//3,5,1
			armstrong=armstrong+(remainder*remainder*remainder);
		}
		if(num==armstrong)
		{
			System.out.println("given number is Armstrong");
		}
		else 
		{
			System.out.println("given number not Armstrong");
		}
	}

}
