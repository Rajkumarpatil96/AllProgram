package exceptions;

public class ArrayOutBoundException {

	public static void main(String[] args) {
		int marks[]=new int [3];
		
		marks[0]=30;
		marks[1]=20;
		marks[2]=30;
		
		try {
			marks[3]=40;
			
		System.out.println(marks[3]);
	}
		catch (ArrayIndexOutOfBoundsException e) 
		{
		System.out.println("Enter the value in between 0-3");
	}
		catch (Exception e) 
		{
		e.printStackTrace();
		System.out.println("Enter the value in between 0-3");
	}
	}

}
