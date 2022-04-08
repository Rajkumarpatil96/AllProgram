package control_statement;
import java.util.Scanner;
public class Nested_if2 {
	int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String username ="501283802023";
String Password="Pass@123";
long PRN=20170300232324l;
String capcha="LM0974";
 String date_of_Birth="15jully1999";
String Result="2021";

if (username=="501283802023")
{
	System.out.println("enter your password");
	if(Password=="Pass@123")
	{
		System.out.println("please enter your PRN NO");
	    if(PRN==20170300232324l)
	     {
		    System.out.println("please enter yor capcha");
		     if(capcha=="LM0974")
		    {
			System.out.println("please enter the birth of date as per ssc marksheet");
			if(date_of_Birth=="15jully1999")
			   {
				System.out.println("Show the Result of 2021");
			    }else
			      {
				System.out.println("please enter the valid input");
			      }
			
		  }else
		  {
			  System.out.println("please enter the valid capcha");
			  
		  }
	     }else
	     {
	    	 System.out.println("please enter the valid PRN ");
	     }
      }else
      {
    	  System.out.println("please enter the correct password");
      }
	}else
	{
		System.out.println("username is incorrect");
	}

}
}