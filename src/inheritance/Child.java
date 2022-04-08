package inheritance;

public class Child extends Father{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child C1=new Child();
C1.lappy();
C1.money();//you can only  give fathers money property because of overlapping we do not give Grandfather money property
//C1.money();//you can only  give fathers money property because of overlapping we do not give Grandfather money property
	}
public void lappy()
{
	System.out.println(" child lappy");
}
}
