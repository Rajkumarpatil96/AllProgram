package polymorphism_Study;

public class Overiding_son extends Father {

	public static void main(String[] args) {
		Father f=new Father();
		f.money();
		Overiding_son S=new Overiding_son();
		S.money();

	}
	public  void money()
	{
		System.out.println(" money of the son is 8900");
	}

}
