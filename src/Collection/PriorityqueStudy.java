package Collection;

import java.util.PriorityQueue;

public class PriorityqueStudy {

	public static void main(String[] args) {
		PriorityQueue Sn=new PriorityQueue<>();
		Sn.add(50);
		
		Sn.add(110);                   //1.data insertion is Random
		Sn.add(100);                   //2.Duplicate are Allow
		Sn.add(200);                    //3.it is Homogeneos 
//		Sn.add("Raj");                
//		Sn.add("Yogesh");
		Sn.add(400);
		Sn.add(600);
		Sn.add(800);
		Sn.add(100);
		System.out.println(Sn);
//		System.out.println(Sn.peek());
//		System.out.println(Sn);
//		System.out.println("Poll Value is "+Sn.poll());
//		System.out.println(Sn);
//		for(Object o:Sn)
//		{
//			System.out.println(o);
//		}
	}

}
