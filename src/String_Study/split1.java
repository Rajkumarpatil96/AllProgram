package String_Study;

public class split1 {

	public static void main(String[] args) {
		String a="velocity corporate training center pune";
	String sep=" ";
	String []output=a.split(sep);
	for(int i=0;i<=output.length-1;i++)
	{
		System.out.println(output[i]);
	}
	
	}

}
