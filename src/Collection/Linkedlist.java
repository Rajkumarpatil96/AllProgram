package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList ln=new LinkedList();
		ln.add(1200);
		ln.add(450.12);
		ln.add("velocity");
		ln.add("corporation");
		ln.add(null);
		ln.add("Traaining");
//		System.out.println(ln);
//		ln.remove(4);
//		System.out.println(ln);
//		ln.add(4, "kedar");
//		System.out.println(ln);
//		System.out.println(ln.size());
//		ln.addFirst("raj");
//		System.out.println(ln);
//		//ln.clear();
//		System.out.println(ln);
		ln.addAll(5, ln);//add all the list as per the specified index
		System.out.println(ln);
		ListIterator li = ln.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("================================================");
		for(int i=0;i<=ln.size()-1;i++)
		{
			System.out.println(ln.get(i));
		}
		System.out.println("==================================================");
		for(Object o:ln)
		{
			System.out.println(o);
		}
	}

}
