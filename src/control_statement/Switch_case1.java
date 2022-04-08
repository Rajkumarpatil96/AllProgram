package control_statement;

public class Switch_case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=5;
switch (num) {
case 1: System.out.println("today is sunday");
break;	
case 2: System.out.println("today is monday");
break;
case 3: System.out.println("today is tuesday");
break;	
case 4: System.out.println("today is Wednesday");
break;	
case 5: System.out.println("today is thursday");
break;	
case 6: System.out.println("today is friday");
break;
case 7: System.out.println("today is saturady");
break;	

default:
	throw new IllegalArgumentException("Unexpected value: " + num);
}
	}

}
