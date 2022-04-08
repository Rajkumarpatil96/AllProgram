package exceptions;

import org.bouncycastle.jcajce.provider.symmetric.DSTU7624.CCM128;

public class ArithmaticException {

	public static void main(String[] args) {
		ArithmaticException art = new ArithmaticException();
		art.m1();
	}
	public void m1() {
		int a=10;
		int b=0;
//		int c = a/b;
//		System.out.println(c);
		try {
		int c = a/b;
		System.out.println(c);
		}
		catch (ArithmeticException e) {
			System.out.println("Any value cannot devide by zero");
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
