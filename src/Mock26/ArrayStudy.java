package Mock26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

public class ArrayStudy {

	public static void main(String[] args) {
	
		ArrayList Ar=new ArrayList<>();
		Ar.add("velocity");
		Ar.add(30);
		Ar.add('A');
		Ar.add(20.12);
		Ar.add(null);
		Ar.add(12);
		Ar.add(222);
		Ar.add(222);
		Ar.add(222);
		Ar.add(222);
		Ar.add(222);
		Ar.add(222);
		System.out.println(Ar);
		Ar.add(4, "Corporate");
		System.out.println(Ar);
		System.out.println(Ar.get(4));
		Ar.remove(4);
		System.out.println(Ar);
		System.out.println(Ar.get(4));
		Ar.remove(2);
		System.out.println(Ar);
		Ar.remove(3);
		System.out.println(Ar);
		Ar.clone();
		System.out.println(Ar);
		Ar.contains(30);
		System.out.println(Ar.contains("velocity"));
		System.out.println(Ar.isEmpty());
//		Ar.clear();
//		System.out.println(Ar);
		System.out.println(Ar.get(1));
		//System.out.println(Ar.hashCode());
		Ar.size();
		System.out.println(Ar.size());
		//System.out.println(Ar.ensureCapacity(12));
		System.out.println(Ar);
	System.out.println(	Ar.indexOf(222));
	System.out.println(Ar.lastIndexOf(222));
	Ar.add(3, "Good morning");
	System.out.println(Ar);
//	Ar.removeAll(Ar);
//	System.out.println(Ar);
	Ar.retainAll(Ar);
	System.out.println(Ar);
	Ar.set(7,"hi");
	System.out.println(Ar);
//	Spliterators<String> d=Ar.spliterator();
//	//Ar.spliterator();
//	
//	
//	System.out.println(d);


//	
		System.out.println("=============By using for loop==============");
		for(int i=0;i<=Ar.size()-1;i++)
		{
			System.out.println(Ar.get(i));
		}
		System.out.println("======================By using while loop=======");
		Iterator it=Ar.iterator();
		
		
		
//		while(it.hasNext()) 
//		{
//			System.out.println(it.next());
//		}
		int a=0;
		while( a<=Ar.size()-1)
		{
			System.out.println(it.next());
			a++;
		}
		System.out.println("===========By using For Each loop===============");
		for(Object o:Ar)
		{
			System.out.println(o);
		}
	}

}
