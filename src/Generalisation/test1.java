package Generalisation;

public class test1 {

	public static void main(String[] args) {
		karmyogi k=new karmyogi();
		k.RULES();
		k.capround();
		k.management();
		k.FESTIVAL();
		k.karmascolarship();
		System.out.println(" university exam fee is "+UNIVERSITY.Examfee);
		System.out.println("==============================================================");
		SVERI S=new SVERI();
		S.RULES();
		S.capround();
		S.management();
		S.FESTIVAL();
		S.hostel();
		System.out.println(" university exam fee is "+UNIVERSITY.Examfee);
		System.out.println("=============================================================");
		FABTECH f=new FABTECH();
		f.RULES();
		f.capround();
		f.management();
		f.FESTIVAL();
		f.Extracurriculum();
		System.out.println(" university exam fee is "+UNIVERSITY.Examfee);
		System.out.println("===============================================================");

	}

}
