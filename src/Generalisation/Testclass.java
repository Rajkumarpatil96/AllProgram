package Generalisation;

public class Testclass {

	public static void main(String[] args) {
		JIO j=new JIO();
		j.call();
		j.data();
		j.msg();
		j.jiotv();
		System.out.println("rate of jio sim card is"+TRAI.sim );
		//System.out.println("rate of jio sim card is"+JIO.sim );
		Airtel A=new Airtel();
		A.call();
		A.data();
		A.msg();
		A.hostar();
		System.out.println("rate of AIRTEL sim card is"+TRAI.sim );
		
		VI k=new VI();
		k.call();
		k.data();
		k.msg();
		k.NETFLIX();
		System.out.println("rate of VI sim card is "+TRAI.sim);

	}

}
