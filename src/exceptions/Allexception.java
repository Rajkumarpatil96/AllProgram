package exceptions;

public class Allexception {

	public static void main(String[] args) {
		String s="velocity";
		//System.out.println(s.charAt(8));
		try {
			System.out.println(s.charAt(8));
		} catch (NullPointerException e) {
			System.out.println("Enter the value inbetween 0-7");
		}catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("Enter the value inbetween 0-7");
		}
	}

}
