package abstract_study;

public class Sample1 extends Sample {

	public static void main(String[] args) {
		Sample1 s=new Sample1();
		s.test();
		s.test1();
		s.test3();
		s.test2();
		

	}
public void test3()
{
	System.out.println("kec");
}
@Override
public void test2() {
	//this is a incomplete method of abstract class complete in sample class(concrete class)
	String name="Raj";
	System.out.println(""+name);
}
}
