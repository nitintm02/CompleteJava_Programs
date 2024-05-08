package Package1;

// what happens inside same package diff class

public class AccessSpecifierEx2 
{

	public static void main(String[] args) 
	
	{
		AccessSpecifierEx1 e1=new AccessSpecifierEx1();
		e1.add();
		//e1.subtr(); // cannot be accessible which is correct and not an error
		e1.mul();
		e1.div();

	}

}
