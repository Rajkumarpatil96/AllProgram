package LogicalProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		String Revstring = "";
			for(int i=name.length()-1;i>=0;i--)
			{
				Revstring=Revstring+name.charAt(i);
			}
			System.out.println("Reverse String is "+Revstring);
	}

}
