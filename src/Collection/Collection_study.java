package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_study {

	public static void main(String[] args) {
		ArrayList<Integer>in= new ArrayList<>();//Specified datatype of integer used in AArraylist
		in.add(30);
		in.add(20);
		in.add(200);
		in.add(30);
		in.add(101);
		in.add(45);
		System.out.println(in);
		System.out.println(in.isEmpty());
		System.out.println("contains method is used to find the element and it returns a true oR false value" +in.contains(20));
		System.out.println("To Fetch the data from perticular index of Arraylist " +in.get(0));
		System.out.println("clone method is used to create a duplicate arraylist " +in.clone());
		System.out.println("lastindex of Arraylist " +in.lastIndexOf(30));
		System.out.println("size of AArraylist " +in.size());
		in.add(0, 50);
		System.out.println(in);
		in.remove(0);
		System.out.println(in);
		System.out.println("==============By using for loop=============");
		for(int i=0;i<=in.size()-1;i++)
		{
			System.out.println(in.get(i));
		}
		System.out.println("=================By using while loop===========");
		Iterator<Integer>it=in.iterator();
		
		while(it.hasNext())//has next gives the return boolean value has next check the next value present in array or not.
		{
			System.out.println(it.next());
		}
		System.out.println("====================BY using for each loop=========");
		for(int a:in)
		{
			System.out.println(a);
		}
		
	}

}
