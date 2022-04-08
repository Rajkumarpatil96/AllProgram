package variable_types;

public class Employee {
	String name;
	String Emp_Id;
	char grade;
	float sallery;
	long Emp_no;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee g1=new Employee();
g1.name="jeevan";
g1.Emp_Id="kt5612";
g1.grade='A';
g1.sallery=8056000.7821545f;
g1.Emp_no=9665657531l;
g1.test();
Employee g2=new Employee();
g2.name="kashiling";
g2.Emp_Id="kt0045";
g2.grade='B';
g2.sallery=4454560.12f;
g2.Emp_no=8308656516l;
g2.test();
	}
public void test()
{
	System.out.println("=============================");
	System.out.println("Employee name is "+name);
	System.out.println("Employee id is "+Emp_Id);
	System.out.println("Employee grade is "+grade);
	System.out.println("Employee sallery is "+sallery);
	System.out.println("Employee no is "+Emp_no);
	System.out.println("==============================");
}
}
