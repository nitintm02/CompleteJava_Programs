package Package1;

abstract class Two
{
	abstract void add (); // abstract method so no implementation
}

public class AbstractClassEx1 extends Two
{

	void subtract() // concrete method
	{
		
	}
	public static void main(String[] args) 
	{
		

	}

	@Override
	void add() {
		
		System.out.println("Addition");
		
	}

}
