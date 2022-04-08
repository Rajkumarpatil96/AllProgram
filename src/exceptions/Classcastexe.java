package exceptions;

public class Classcastexe extends ArithmaticException{

	public static void main(String[] args) {
		ArithmaticException a=new ArithmaticException();
		//Classcastexe n=(Classcastexe)a;
//		n.m1();
		try {
			Classcastexe n=(Classcastexe)a;
			n.m1();
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}catch (ArithmeticException e) {
			
			System.out.println(e.getMessage());
		}
//		ArithmaticException ar=new Classcastexe();
//		ar.m1();
//		ArithmaticException vr=(ArithmaticException)ar;
//		vr.m1();
		
	}
	public void m1()
	{
		System.out.println("classcast exception");
	}

}
