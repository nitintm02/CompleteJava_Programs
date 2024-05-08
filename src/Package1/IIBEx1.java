package Package1;

public class IIBEx1 
{
	static //SIB
	{
		System.out.println("SIB 1");
	}
	static
	{
		System.out.println("SIB 2");
	}
	//IIB 
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main method");
		IIBEx1 i1 = new IIBEx1 ();

	}

}
