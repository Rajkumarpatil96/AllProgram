//program for grading using else if
package control_statement;

public class Ifelse_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int mark=35;
//if(mark>=40)
//{
//	System.out.println("he wiil be pass");
 if(mark>40 &&mark<60)
{
	System.out.println("class D");
}else if (mark>=60&&mark<75)
{
	System.out.println("class C");
	
}else if(mark>=75&&mark<85)
{
	System.out.println("class B");
}else if(mark>=85&&mark<=100)
{
	System.out.println("Class A");
}else
{
	System.out.println("he will be fail");
}
	}

}
