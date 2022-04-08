package exceptions;

public class StringIndexOutofBoundException {

	public static void main(String[] args) {
		String s="Velocity";
		
		try {
		System.out.println(s.charAt(8));
		
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("Enter the number in between 0-7");
		}
		

	}

}
