package String_Study;

public class String_use {

	public static void main(String[] args) {
		String s="abc";//without using this keyword object stored in constant pool Area                 //(==:depend on asign memory location of object then give the boolean value)
		String s1="abc"	;	
		String s2="cde";
		String a=new String("vel");	//by using new keyword object stored in non static pool area	      //(equal();depend on asign of the content of object then show the boolean value)
		String b=new String("vel");
		String c=new String ("velocity");
				
		if(s==s2)
		{
			System.out.println("if there is content same in object creation then memory allocation is same ");
		}else
		{
			System.out.println("memory allocation is different");
		}
		if(a.equals(b))	
		{
			System.out.println("content is same  memory allocation is different");
		}
		else
		{
			System.out.println("memory allocation different content different");
		}
				
				
				
				
	}

}
