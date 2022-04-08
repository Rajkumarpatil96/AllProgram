package String_Study;

public class equalignorcase {//in the equal ignor case the string is same length is it is non case sensetive

	public static void main(String[] args) {
		String a="velocity";
		String b="VELOCITY";
		String c="karmayogi";
		System.out.println(a.equalsIgnoreCase (b));
		System.out.println(a.equalsIgnoreCase(c));
	}

}
