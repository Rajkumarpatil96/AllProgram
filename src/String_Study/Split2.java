package String_Study;

public class Split2 {

	public static void main(String[] args) {
		String a="snehal yashwant bhagat";
		String j=" ";
		String[]object=a.split(j);
		for(int i=0;i<=object.length-1;i++){
			System.out.println(object[i]);
		}
	}

}
