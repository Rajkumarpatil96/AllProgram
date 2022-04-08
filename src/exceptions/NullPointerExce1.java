package exceptions;

public class NullPointerExce1 {

	public static void main(String[] args) {
		String s=null;
		try {
			System.out.println(s.charAt(0));
		} 
		
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled by arithmatic exception");
		}
		catch(NullPointerException e)
		{
			System.out.println("can not perform any action on null value ");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled by ArrayIndex out of bound exception");
			
		}
	}

}
