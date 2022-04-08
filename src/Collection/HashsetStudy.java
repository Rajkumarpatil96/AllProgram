package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetStudy {

	public static void main(String[] args) {
		HashSet hs=new HashSet<>();//duplicates are not allowed in hashset one null value can accept
		hs.add(100);				//in  hashset order of insertion ----->Random
		hs.add("Velocity");			//Data Structure --->hashtable
		hs.add(100);				//Storage Type--->hashtable
		hs.add(null);				//No default capacity
		hs.add(null);				//Best choice for the to remove duplicate element when order of insertion is not mandatory
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		//System.out.println(hs.remove(null));
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println("===========By using For Each loop retrive the operation==========");
		for(Object o:hs)
		{
			System.out.println(o);
		}
		System.out.println("===============By using while loop===========================");
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===============By using for loop========================");
		//we cannot use for loop because of the for loop retrive data get method is used in that set 
		//concept index is not present data Structure depend upoun the hashtable.
//		for(int i=0;i<=hs.size()-1;i++)
//		{
//			System.out.println(hs.g);
//		}
	}

}
