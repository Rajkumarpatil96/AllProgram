package Araay_Study;

import java.util.Arrays;

public class demo2 {

	public static void main(String[] args) {
		int []mark=new int[5];
		mark[0]=50;//phy
		mark[1]=35;//english
		mark[2]=40;//marathi
		mark[3]=55;//history
		mark[4]=60;//hindi
		System.out.println("===========befor sorting========");
		for(int i=0;i<=4;i++)
		{
			System.out.println(mark[i]);
		}
		Arrays.sort(mark);
		System.out.println("=============after sorting=========");
		for(int i=0;i<=mark.length-1;i++)
		{
			System.out.println(mark[i]);
		}
		System.out.println("========sorting dec order===========");
		for(int i=4;i>=0;i--)
		{
			System.out.println(mark[i]);
		}
	}

}
