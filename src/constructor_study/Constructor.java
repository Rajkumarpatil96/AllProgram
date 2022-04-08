package constructor_study;

public class Constructor {
	int num;
	String name;
public Constructor()
{
	num=30;
	name="ABC";
	
}
public Constructor(int a,String str)

{
	num=a;
	name=str;
}
	public static void main(String[] args) {
		
Constructor c=new Constructor();
System.out.println("zero parameter constructor"+c.num);
System.out.println("zero parameter constructor"+c.name);
Constructor d=new Constructor(30,"raj");
System.out.println("with parameter constructor"+d.num);
System.out.println("with parameter constructor "+d.name);
	}

}
