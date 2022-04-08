package Mock26;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayStudy1 {

	public static void main(String[] args) {
		ArrayList<Integer>A=new ArrayList<>();
		A.add(10);
		A.add(20);
		A.add(30);
		A.add(40);
		A.add(50);
		A.add(60);
		A.add(70);
		A.add(100);
		for(int i=0;i<=A.size()-1;i++ )
		{
			System.out.println(A.get(i));
		}
		System.out.println("========================");
		Iterator<Integer>it=A.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=======================");
		for(int a:A)
		{
			System.out.println(a);
		}
		System.out.println("======================================");
		for(int i=1;i<=12;i++)
		{
			if(i==5 || i==7)
			{
				System.out.print("");
			}else {
				System.out.println(i);
			}
			//System.out.println();
//			String s="@#$^^$$chetan#^%!";
//			System.out.println(s.replaceAll("[a-z]","" ));
		}
		String s="@#$^^$$chetan#^%!APPLE";
		System.out.println(s.replaceAll("[A-z]","" ));
	}

}
