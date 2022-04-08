package String_Study;//equals method --->can compares  the content 

public class Equals {

	public static void main(String[] args) {
		String a="karmyogi";
		String b="velocity";
		String c=new String("karmyogi");
		String d=new String ("velocity");
		System.out.println("equal method can compares the content  ans is "+a.equals(c));
		System.out.println(a.equals(b));
		System.out.println(b.equals(d));
		System.out.println(b.equals(c));

	}

}
