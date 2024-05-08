package Package1;

public class SIBEx 
{
	
	
	public static void main(String[] args) //main method
	{
		 System.out.println("i am main method");
		

	}
	
	static //SIB - observe SIB executes 1st irrespective of order
	{
		System.out.println("I am SIB");
	}
	static //SIB - observe SIB executes 1st irrespective of order
	{
		System.out.println("I am SIB 2");
	}

}
