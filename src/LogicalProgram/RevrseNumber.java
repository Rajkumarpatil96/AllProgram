package LogicalProgram;

import java.util.Scanner;

public class RevrseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		String Strnum = Integer.toString(num);
		String revstrnum = "";
		for(int i=Strnum.length()-1;i>=0;i--)
		{
			revstrnum=revstrnum+Strnum.charAt(i);
		}
		System.out.println(revstrnum);
		int num1 = Integer.parseInt(revstrnum);//converting String int value into integer value
		System.out.println(num1+102);
		
	}

}
