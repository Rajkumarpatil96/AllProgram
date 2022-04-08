package String_Study;

public class equql1 {

	public static void main(String[] args) {
		String s="velocity";
		String s1="training";
//		String s2="velocity";
//		String a=new String("velocity");
//		String b=new String("Velocity");
//	System.out.println(s.equals(a));//
//	System.out.println(s==a);//==
//	System.out.println(s1.length());
//	System.out.println(s.toUpperCase());
//	System.out.println(s1.toLowerCase());
//	String c="VELOCITY";
//	System.out.println(s.equalsIgnoreCase(c));
//	System.out.println(s.contains("city"));
	String d=" ";
	String e="";
	System.out.println(e.isEmpty());
	System.out.println(d.isBlank());
	System.out.println();
	String J="yogesh";
	System.out.println(s1.charAt(5));
	System.out.println(J.endsWith("yo"));
	System.out.println(J.startsWith("yo"));
	System.out.println(J.replace("yogesh", "yogita"));
	System.out.println(J.indexOf('g'));
	System.out.println(J.substring(2,5));
	String h="velocity corporate traning center";
	String l=" ";
	String[] output = h.split(l);
	//System.out.println(output);
	for(int i=0;i<=output.length-1;i++)
	{
		System.out.println(output[i]);
	}
	//System.out.println();
	
	
	
	
	

	}

	private static int length() {
		// TODO Auto-generated method stub
		return 0;
	}

}
