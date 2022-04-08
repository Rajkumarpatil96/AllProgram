package loops;

public class For_loop3 {

	public static void main(String[] args) {
		For_loop3 v=new For_loop3 ();
		v.test1();
	}
	public void test1()
	{
		
		int number=123,reverse=0;
for(;number!=0;number=number/10)
{int  remainder=number%10;
	reverse=reverse*10+remainder;
	//System.out.println(reverse);
}
System.out.println(reverse);
	}

}
