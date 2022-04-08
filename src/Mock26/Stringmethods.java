package Mock26;

public class Stringmethods {

	public static void main(String[] args) {
		String s="yogesh";
		String s1="chetan";
		String k=new String("india");
		String j=new String("CHEtan");
		//length()
		System.out.println(s.length());
		//equals()
		System.out.println(s1.equals(k));//false
		System.out.println(s1.equals(j));//true
		//touppercase
		System.out.println(k.toUpperCase());//uppercase
		//==()
		System.out.println(s1==j);//false
		String S3="yogesh";
		System.out.println(s==S3);//
		System.out.println(s.equals(S3));//true
		//Tolowercase()
		String S4="VELOCITY";
		System.out.println(S4.toLowerCase());
		//Replace()
		System.out.println(S4.replace("VELO", "LOVE"));//LOVECITY
		//contains()
		System.out.println(S4.contains("CITY"));
		//subString()
		System.out.println(S4.substring(2));
		System.out.println(S4.substring(0, 5));
		//indexof()
		System.out.println(k.indexOf('i'));
		//concat
		System.out.println(S4.concat(" corporation"));
		System.out.println(("velocity").concat(" TRAINING"));
		System.out.println(s1+" "+ S4);
		//TRIM()
		String s5=" ganesh ";
		System.out.println(s5.trim());//remove the Space from start and end of String
		System.out.println(s5);
		//isempty()
		String S6="";
		String S7=" ";
		System.out.println(S6.isEmpty());
		System.out.println(S7.isEmpty());
		System.out.println(S6.isBlank());
		System.out.println(S7.isBlank());
		//CharAt()
		System.out.println(s5.charAt(2));
		//equalignore()
		System.out.println(s1.equalsIgnoreCase(j));
		//Split()
		String l="I love MY India";
		String m=" ";
		String[] n = l.split(m);
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]);
			System.out.print(" ");
		}
		System.out.println();
		
		//Tochar[]
		String b="RAJKUMAR";
		char[] name = b.toCharArray();
		for(char  b1:name)
		{
		System.out.println(b1);	
		}
		//IsDigit()
		char a='1';
		boolean chrdigit = (Character.isDigit(a));
		System.out.println(chrdigit);//true----->identify the digit
		//IsAlbhabet()
		System.out.println(Character.isAlphabetic(a));
		int z=15;
		System.out.println(Character.isDigit(z));
		//Primitive data type into String(non primitive datatype) 
		int d=23;
		String ss = (String.valueOf(d));
		System.out.println(ss+2);
		boolean hg=true;//convert boolean into String
		String bb = String.valueOf(hg);
		System.out.println(bb+("hhhhh"));
	}
	
}
