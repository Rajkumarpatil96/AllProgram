package Araay_Study;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		//Declaration
		char grade[]=new char[6];
		//INITIALIZATION
		grade[0]='D';
		grade[1]='F';
		grade[2]='A';
		grade[3]='C';
		grade[4]='B';
		grade[5]='E';
		System.out.println("=============Befor sorting+==============");
		for(int i=0;i<=grade.length-1;i++)
		{
			System.out.println(grade[i]);
		}

		Arrays.sort(grade);//Arrays is inbuilt class of java and sort is static method of array then syntax of calling static method from another class----->classname.methodename
							//i.eclassname.methodename-->arrays.sort();
		System.out.println("===========After sorting=====================");
		for(int i=0;i<=grade.length-1;i++)
		{
			System.out.println(grade[i]);
		}
		System.out.println("=============sorting descending order=========");
		for(int i=grade.length-1;i>=0;i--)
		{
			System.out.println(grade[i]);
		}
	}

}
