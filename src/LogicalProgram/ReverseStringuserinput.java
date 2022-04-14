package LogicalProgram;

import java.util.Scanner;

public class ReverseStringuserinput {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	String name = sc.next();
	String revString = "";
	for(int i=name.length()-1;i>=0;i--)
	{
		revString=revString+name.charAt(i);
	}
	System.out.println(revString);
}
}
