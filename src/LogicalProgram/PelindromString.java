package LogicalProgram;

import java.util.Scanner;

public class PelindromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String Originalstr = sc.next();
		String Reversestr = "";
		for(int i=Originalstr.length()-1;i>=0;i--)
		{
			Reversestr=Reversestr+Originalstr.charAt(i);
		}
		System.out.println("Original String is "+Originalstr);
		System.out.println("Reverse string is "+Reversestr);
		if(Originalstr.equals(Reversestr))
		{
			System.out.println("Given string is pelindrom");
		}else {
			System.out.println("Given String not an pelindrom");
		}
		
	}

}
