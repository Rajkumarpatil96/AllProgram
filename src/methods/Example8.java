//static & non static method in same class
package methods;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example8.string();//calling static method of same class
//calling non  static method to create a object
Example8 e8=new Example8();
e8.l1();
	}
	public static void string()//static method defination
	{
		
		String Acc_holder_name="John Cena";
		String bankname="Bank of india";
		long Acc_no=171710510006087l;
		System.out.println("Account name is "+ Acc_holder_name);
		System.out.println("Bankname is "+bankname);
		System.out.println("Acc no is "+Acc_no);
	}
	public void l1()//non static method defination
	{
		String shopping=" red T shirt";
		int quantity=10;
		int price=500;
		float descount=150.50f;
		System.out.println("shopping"+shopping);
		System.out.println("quantity"+quantity);
		System.out.println("price "+price);
		System.out.println("descount "+descount);
	}
	

}
