package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetStudy {

	public static void main(String[] args) {
		TreeSet tr=new TreeSet<>();						//1.order of insertion ----->Ascending
		tr.add(100);									//2.it is Homogeneous
		tr.add(20);
		tr.add(30);
		System.out.println(tr);
		System.out.println(tr.size());
		//System.out.println("pollfirst element is "+ tr.pollFirst());//10
		//System.out.println("polllast element is "+tr.pollLast());//100
		System.out.println("===================================");
		
		for(Object O:tr)
		{
			System.out.println(O);
		}
		System.out.println("============================");
		Iterator it = tr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
