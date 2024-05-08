package Package1;
class Method_Parent
{
	  void login()
	{
		System.out.println("Mobile Login");
		
	}
}
public class MethodOverRidingEx1 extends  Method_Parent
{
	 void login()
	{
		System.out.println("Email Login");
		super.login();// -- will help in calling both methods in case of method over riding
	}
	public static void main(String[] args) 
	{
		
		MethodOverRidingEx1 l1= new MethodOverRidingEx1();
		l1.login ();
	
	}

}
