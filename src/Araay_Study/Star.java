package Araay_Study;

public class Star {

	public static void main(String[] args) {
		int [][] star=new int[4][4];
		star[0][0]= 1;
		star[1][1]=2;
		star[2][2]=3;
		star[3][3]=4;
		for(int i=0;i<=star.length-1;i++)
		{ 
			
			for(int j=0;j<=star.length-1;j++)
			{
				System.out.println(star[i][j]);
			}
			//System.out.println(" ");
		}
		

	}

}
