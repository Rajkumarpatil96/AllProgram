package abstract_study;

public class V10_1 extends V10_0{

	public static void main(String[] args) {
		V10_1 ob=new V10_1();
		ob.BankStatement();
		ob.BankActivity();
		ob.CreditStatus();
		ob.EMI();
		ob.FD();
		ob.Billpayment();
	}

	@Override
	public void FD() {
		
		System.out.println("Fixed Deposit");
	}

	@Override
	public void Billpayment() {
		
		System.out.println("billpayment");
	}

}
