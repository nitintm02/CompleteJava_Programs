package Package1;

abstract class Amazon_Auth
{
	abstract void un();//abstract method
	abstract void un_mob();//abstract method
	 void login_button() // concrete
	
		 {
				System.out.println("logic1");
			}
	
}

abstract class Amazon_login extends Amazon_Auth
{
	abstract void un_as_email();
	abstract void un_as_mobile();
	void registration_button()
	{
		System.out.println("logic1");
	}
}
public abstract class AbstractEx2  extends Amazon_Auth
{
	
	static void loginwith_mob()
	{
		
	}
	
		
		public static void main(String[] args) {
			

		}


}

