package control_statement;
import java.util.Scanner;
public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if age is grater than 18 then you are adult &smaller than 18 not an adult
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("you are adult");
		}else {
			System.out.println("not an adult");
		}
		if(num%2==0)
		{
			System.out.println("number is even number");
		}else {
			System.out.println("odd number");
		}
	}

}
