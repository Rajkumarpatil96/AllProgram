package Casting;

public class Son extends father{

	public static void main(String[] args) {
		father f=new father();
		f.money();//calling money  method of super class
		Son s=new Son();//creating object of own class
		s.money();//calling money method of own class
		s.bike();//calling bike method of sub class
		father g=new Son();//casting--->assigning property of sub class to the super class
		g.money();//eligible for casting because propery of  the superclass &sub class are same
		//g.bike();not eligible for casting as its not common/ superclass method
	}
	public void money()
	{
		System.out.println(" son of the money is 10L");
}
public void bike()
{
	System.out.println(" bike of Son is pulser");
}
}
