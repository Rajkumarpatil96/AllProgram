package String_Study;

public class Countchar {

	public static void main(String[] args) {
		String c="rajkumar";
		 int out    = c.length();
		
		for(int i=0;i<=out-1;i++)
		{
			
			{
			
			System.out.println(c.codePointCount(i, out));
			}
			//System.out.println();
		}
		//System.out.println("");
		

	}

}
