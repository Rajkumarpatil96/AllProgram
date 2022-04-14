package Mock27;

public class Diamond {
//   *
//  ***
// *****
//*******
// *****
//  ***
//   *


	public static void main(String[] args) {
		int space=3;
		int star=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
	   }
		int star1=5;
		int space1=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star1=star1-2;
			space1++;
		}
		

}
}