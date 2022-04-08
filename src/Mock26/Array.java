package Mock26;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		String d="velocity";
		//System.out.println(d.indexOf('l'));
		for(int i=d.length()-1;i>=0;i--)
		{
			System.out.print(d.charAt(i));
		}
		System.out.println();
		
		//Array
 int[]mark= {50,20,80,40};//initialize array
 		for(int i=0;i<=mark.length-1;i++)
 		{
 			System.out.println(mark[i]);
 
 		}
 		Arrays.sort(mark);
 		System.out.println("==================After Sorting=======");
 		for(int i=0;i<=mark.length-1;i++)
 		{
 			System.out.println(mark[i]);
 
 		}
 		System.out.println("=========Dec order=============");
 		//Arrays.sort(mark);
 		for(int i=mark.length-1;i>=0;i--)
 		{
 			System.out.println(mark[i]);
 
 		}
	
	}

}
