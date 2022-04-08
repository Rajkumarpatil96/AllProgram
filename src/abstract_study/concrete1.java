package abstract_study;

public class concrete1 extends Abstract1 {

	public static void main(String[] args) {
		concrete1 v=new concrete1();
		v.mul();
		v.div();
	}

	@Override
	public void mul() {
		int a=10;
		int b=20;
		int mul=a*b;
		System.out.println(""+mul);
		
	}

	@Override
	public void div() {
int a=90;
int b=40;
int div=a/b;
System.out.println(""+div);

		
	}

}
