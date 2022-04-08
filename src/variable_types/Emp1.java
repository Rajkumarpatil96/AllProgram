package variable_types;

public class Emp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp1 obj=new Emp1();
obj.details("kashiling"," HT0012", 'A',8793767346.98f , 9665657531l);
obj.details("jeevan", "UT1012", 'A', 2678263.673f, 9404035077l);
	}
public void details(String name,String Emp_Id,char Grade,float sallary,long Emp_MoNo)
{
	System.out.println("==============================");
	System.out.println("Employee name is "+name);
	System.out.println("Employe Id is "+Emp_Id);
	System.out.println("Employee grade is "+Grade);
	System.out.println("Employee sallary is "+sallary);
	System.out.println("Emp mobile no is "+Emp_MoNo);
	System.out.println("===============================");
}
}
