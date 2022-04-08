package control_statement;

public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if username is correct then please enter the password if password is correct then "login successful".welcome
		String username="Rajkumar";
		String password="Pass@123";
		if(username=="Rajkumar")
		{
			System.out.println("please enter the password");
			if(password=="Pass@123")   //Nested if means inner part of the outer if statement 
			{
				System.out.println("login successful");
			}else 
			{
				System.out.println("please check your password");
			}
		}else
		{			System.out.println("please enter valid username");
		}
	}

}
