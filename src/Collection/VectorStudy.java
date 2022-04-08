package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(12);
		v.add(45);
		v.add("velocity");
		v.add(null);
		v.add("Training");
		System.out.println("=========By using enumeration===========");
		Enumeration l = v.elements();//only support to the legacy class in vector we can use the Enumeration
		while(l.hasMoreElements())
		{
			System.out.println(l.nextElement());
		}
		System.out.println("=========================By using iterator cursor============");
		
		
			Iterator vt = v.iterator();
			while(vt.hasNext())
			{
				System.out.println(vt.next());
			}
	}

}
