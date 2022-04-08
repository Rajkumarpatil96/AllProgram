package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedhashsetStydy {

	public static void main(String[] args) {
		LinkedHashSet lh=new LinkedHashSet<>();
		lh.add(200);
		lh.add("gautam");
		lh.add('A');
		lh.add('A');
		lh.add(200.12);
		lh.add("training");
		lh.add(null);
		
		lh.hashCode();
		System.out.println(lh);
		for(Object o:lh) {
			System.out.println(o);
		}
		System.out.println("==============================");
		Iterator it = lh.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("========By using Specific datatype==========");
		TreeSet<String> s=new TreeSet<>();
		s.add("h");
		s.add("i");
		s.add("good");
		s.add("morning");
		s.add("vellocity");
		s.add("Training");
		s.add("Center");
		
		System.out.println(s.size());
		for(String k:s)
		{
			System.out.println(k);
		}
		System.out.println("=====================================");
		Iterator<String> it1 = s.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}

}
