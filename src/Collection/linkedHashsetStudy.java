package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashsetStudy {

	public static void main(String[] args) {
		LinkedHashSet lh=new LinkedHashSet<>();//1.it does not allow duplicate value
		lh.add(200);							//2.it can allow only one null value
		lh.add(200);							//3.order of insertion maintain
		lh.add("velocity");						//4.Data Structure is HYBRID(linear+Hashtable)
		lh.add("training");						//5.Storage type --->hashtable
		lh.add('a');							//6.no default capacity
		lh.add(null);
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println(lh.contains("velocity"));
		lh.spliterator();
		System.out.println(lh);
		System.out.println("============================");
		for(Object o:lh)
		{
			System.out.println(o);
		}
		Iterator it = lh.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
