package constructor_study;

public class Ex2 {
	//public Ex2()//default constructor
	{
		 //constructor provided the constructor at the time of compiler at the time of compilation
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ex2 e=new Ex2();//create object of same class

e.meth("kk", 'k', 736476739397l, 100.2);


	}
	public void meth(String name,char grade,long acc_no,double num)
	{
		System.out.println("name is "+name +"\n grade is "+grade+ "\n account number is "+acc_no +"\n number is non decimal "+num);
	}

}