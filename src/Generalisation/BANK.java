package Generalisation;

public class BANK {

	public static void main(String[] args) {
		HDFC c=new HDFC();
		c.account();
		c.FD();
		c.loan();
		c.health_policy();
		System.out.println("minimum account balance"+RBI.accountMinBal);
		System.out.println("==========================================================");
		ICICI e=new ICICI();
		e.account();
		e.FD();
		e.loan();
		e.health_policy();
		System.out.println("minimum account balance is"+RBI.accountMinBal);
System.out.println("=========================================================================");
	}

}
