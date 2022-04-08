package inheritance;

public class Son1 extends mother1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Son1 B=new Son1();//creating own object of subclass
B.apple();//using own property
B.scooty();//calling super class
B.field();//calling super class
Grandmother.keys();//calling supermost class property
Grandmother.jwellary();//calling supermost class property
Samsung();	//calling its own property
}
	public void apple()
	{
		System.out.println("Apple mobile");
	}

	public static void Samsung()
	{
		System.out.println("Samsung laptop");
	}
}
