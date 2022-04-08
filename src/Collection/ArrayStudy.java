package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayStudy {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();//using Default Arraylist datatype is not declare hence it is a default arraylist
		//Default value of Arraylist is 10.
		//we can Resize the value of Arraylist by using formula ((current value*3/2)+1)
		al.add("velocity");
		al.add(30);
		al.add("corporation");
		al.add(50);
		al.add("Training");
		al.add(null);
		al.add(80);
		al.add('A');
		al.add('B');
		System.out.println(al);
		System.out.println(al.get(5));
		al.add(5, "kedar");//insert
		System.out.println(al);
		System.out.println("====================By using For each loop========");
		for(Object o:al)
		{
			System.out.println(o);
		}
		System.out.println("==================By using while loop=============");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("================By using for loop==============");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
	}

}
