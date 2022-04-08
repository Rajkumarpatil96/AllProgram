package interface_study;//multiple inheritance

public class Collage implements ENTC,MECH,cse {

	public static void main(String[] args) {
		Collage c=new Collage();
		c.computer();
		c.java_langauge();
		c.C_language();
		c.Research_and_devlopement();
		c.autocad();
		c.TOM();
		c.HOD_cabin();
		c.classroom();
		c.practicle_lab();

	}

	
	public void computer() {
		System.out.println("incomple method computer of interface CSE is complete in collge implementation class");
		
	}

	@Override
	public void java_langauge() {
		System.out.println("incomple method JAVA LANGUAGE of interface CSE is complete in collge implementation class");
		
	}

	@Override
	public void C_language() {
		System.out.println("incomple method C LANGUAGE of interface CSE is complete in collge implementation class");
		
	}

	@Override
	public void Research_and_devlopement() {
		System.out.println("incomple method RESEARCH AND DEVLOPEMENT of interface MECH is complete in collge implementation class");
		
	}

	@Override
	public void autocad() {
		System.out.println("incomple method AUTOCAD of interface MECH is complete in collge implementation class");
		
	}

	@Override
	public void TOM() {
		System.out.println("incomple method TOM of interface MECH is complete in collge implementation class");
		
	}

	@Override
	public void classroom() {
		System.out.println("incomple method CLASSROOM of interface E&TC is complete in collge implementation class");
		
	}

	@Override
	public void practicle_lab() {
		System.out.println("incomple method PRACTICLE LAB of interface E&TC is complete in collge implementation class");
		
	}

	@Override
	public void HOD_cabin() {
		System.out.println("incomple method HOD CABIN of interface E&TC is complete in collge implementation class");
		
	}

}
