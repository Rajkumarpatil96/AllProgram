package Mock26;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
	//String[][]name= {{"Corporate","abcd"},{"training","pune"}};
	String [][]name=new String[2][2];
	name[0][0]="Corporate";
	name[0][1]="Abcdf";
	name[1][0]="lajjdxk";
	name[1][1]="yrsilis";
	
	//String c = (name[i]);
	for(int i=0;i<=name.length-1;i++)
	{
		for(int j=0;j<=name.length-1;j++)
		{
			System.out.print(name[i][j]+" ");
		}
		System.out.println();
	}
	{
		
		
	}
	
	

	}

}
