package control_statement;

public class Nested_if1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if username is correct then enter the password then password is correct then goto enter the captcha then login successful then welcome to the flipkart
		String Username="Rajkumar patil";
		String password="Raj@123";
		String capcha="LM0912";
		String page="welcome";
		if(Username=="Rajkumar patil")
		{
			System.out.println("please enter the password");
			if(password=="Raj@123")
			{
				System.out.println("please enter the capcha");
				if(capcha=="LM0912")
				{
					System.out.println("LOGIN SUCCESSFUL");
					if(page=="welcome")
					{
						System.out.println("Welcome to the flipkart");
					} 
					
						
					}else
				{
					System.out.println("please enter the correst capcha");
				}
			}else
			{
				System.out.println("please enter the valid  password");
			}
		}else
		{
			System.out.println("please enter the valid username");
		}
	}

}
