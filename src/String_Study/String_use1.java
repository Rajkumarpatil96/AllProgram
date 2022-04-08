package String_Study;

public class String_use1 {

	public static void main(String[] args) {

String a="Raj";//without new keyword object stored in constant pool area
String b="Raj";
String k="raj";
String c=new String("velocity");
String d=new String("velocity");

//System.out.println(a==b);
//System.out.println(a==c);
//System.out.println(a==d);
//System.out.println(a.equals(b));
//System.out.println(a.equals(c));//compare the content of object
//System.out.println(a.equals(d));
//System.out.println(c==d);//==compare the memory location object
//System.out.println(c.equals(d));
//


System.out.println(a.length());
System.out.println("length of c is "+c.length());//String class length method
System.out.println("equals ignor case method  compare the length & size of compared String "+k.equalsIgnoreCase(a));
System.out.println(c.toUpperCase());//String class uppercase method 

String s1=c.toUpperCase();            //s1 is an referance variable we can use upper case again again because of this reference variable is create


System.out.println(s1.toLowerCase());//string class lower case method 

System.out.println(a.contains("Ra"));//String class contains method


	}

}
