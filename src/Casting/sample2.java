package Casting;

public class sample2 extends sample1 {

	public static void main(String[] args) {
		sample1 s=new sample2();
		s.bike();
		s.nature();
		//s.laptop();
		sample2 d=new sample2();
		d.bike();
		d.laptop();
		d.nature();

	}
	public void nature()
	{
		System.out.println("sample2 nature ");
		
	}
	public void bike()
	{
		System.out.println("sample2 bike");
		super.bike();
	}
	public void laptop()
	{
		System.out.println("sample2 laptop");
	}

}
