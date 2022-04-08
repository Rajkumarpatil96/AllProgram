package inheritance;

public class Son extends Mother {//child class multilevel inheritance

	public static void main(String[] args) {
		Son ob=new Son();
		ob.laptop();//using own property
ob.money();//using super class property 
gold();//using super class  property
jwellary();
keys();
	}
public void laptop()
{
	String laptop="Dell";
	int Price=65000;
	System.out.println(" The name of laptop is Dell"+ laptop +"\n the price of laptop is "+ Price);
}
}
