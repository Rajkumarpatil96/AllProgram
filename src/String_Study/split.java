package String_Study;

public class split {

	public static void main(String[] args) {
		String a="I love my india";
		String sep=" ";
		 String[] output = a.split(sep);
		// System.out.println(output[0]);
		 for(int i=0;i<=output.length-1;i++)
		 {
			 System.out.println(output[i]);
		 }

	}

}
