//A year is a leap year, it is divisible by 4&400.But not by 100.
package control_statement;

public class If_else_Study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
If_else_Study1 obj= new If_else_Study1();

		int year=2028;
if(((year%4==0  )&(year%100!=0)&(year%4==0)))
		{
	System.out.println("leap year");
		}else {
			
			System.out.println("common year");
		}
year();
	}
public static void year()
{
	int year=2024;
	
	if(year%4==0 || year%400==0)
	{
		System.out.println("LEAP year ");
	}else if(year%100!=0)
	{
		System.out.println("COMMON YEAR");
	}
		
}
	
	
	

}
