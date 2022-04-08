package Araay_Study;

public class Threedimension {

	public static void main(String[] args) {
		int matrix[][]= {{10,22,33},{30,40,50},{60,70,80}};
		//int matri[][]=new int[3][3];
	
		System.out.println("length of matrix " + matrix.length);
	//System.out.println(matrix.length-1);
	//int output = matrix.length-1;
		for(int i=0;i<=matrix.length-1;i++)
		{
			for (int j=0;j<=matrix.length-1;j++)
			{
			System.out.print(matrix[i][j] +"  ");
			}
			System.out.println("   ");
		}
		
		
	}


}



