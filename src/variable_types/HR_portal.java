package variable_types;

public class HR_portal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp_detail Raj=new Emp_detail();//calling non static method from another class
Raj.name="Rajkumar p";
Raj.Emp_Id="Kt 0012";
Raj.grade='A';
Raj.salary=12000.500f;
Emp_detail sachin=new Emp_detail();
sachin.name="sachin T";
sachin.Emp_Id="Kt00000123";
sachin.grade='B';
sachin.salary=12345654.125f;
Raj.Emp_info();
sachin.Emp_info();
	}

}
