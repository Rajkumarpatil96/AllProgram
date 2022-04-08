package abstract_study;

public class concrete2 extends Abstract2 {

	public static void main(String[] args) {
		concrete2 d= new concrete2();
		d.sagar();
		d.data();

	}

	@Override
	public void data() {
		int a=70;
		int b=80;
		int sum=a+ b;
		System.out.println("sum of the data method "+sum);
		
	}

	@Override
	public void sagar() {
		float s=20;
		float d=89;
		float mul=s*d;
		System.out.println(""+mul);
		
	}

}
