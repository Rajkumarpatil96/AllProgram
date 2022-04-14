package Mock27;

public class Palindrom {

	public static void main(String[] args) {
		String s="DaD";
		String reverseStr = "";
		//System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--)
		{
			reverseStr=reverseStr+s.charAt(i);
		}
		System.out.println(reverseStr);
		if(s.equals(reverseStr))
		{
			System.out.println("Given String is palindrom STRING");
		}
		else
		{
			System.out.println("String is not palindrom");
		}

	}

}
