package interface_study;

public class collge1 implements MECH1,ENTC1{

	public static void main(String[] args) {
	
collge1 c=new collge1();
ENTC1.HOD_cabin();
MECH1.HOD_cabin();
c.classroom();


	}

	@Override
	public void classroom() {
		// TODO Auto-generated method stub
		ENTC1.super.classroom();
		MECH1.super.classroom();
	}

	
	

	

	

}
