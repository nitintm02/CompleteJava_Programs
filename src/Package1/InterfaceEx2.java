package Package1;
interface Interface2
{
	void login ();
	void logout();
	
}

interface Interface1 extends Interface2
{
	void search ();
	void payment();
}

public class InterfaceEx2 implements Interface1 
{
	
	InterfaceEx2 c1 = new InterfaceEx2();

	
	void order_page()
	{
		
	}
	
	static void address_page()
	{
		
	}
	public static void main(String[] args) {
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		
	}

}
