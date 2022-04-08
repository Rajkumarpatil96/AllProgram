package Generalisation;

public class Airtel  implements TRAI{

	@Override
	public void call() {
		System.out.println("Airtel call-10p/min");
		
	}

	@Override
	public void msg() {
		System.out.println(" msg of Ajirtel is 50 msg /day");
	}

	@Override
	public void data() {
		System.out.println("Airtel data --1.5 GB/day");
		
	}
	public void hostar()
	{
		System.out.println("Aitrel Hostar --6 month free");
	}

}
