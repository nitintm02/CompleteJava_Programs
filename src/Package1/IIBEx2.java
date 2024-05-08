package Package1;

public class IIBEx2 
{
	
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		IIBEx2 e2=new IIBEx2();
		IIBEx2 e3=new IIBEx2();
	}
		
		IIBEx2 ()
		{
			System.out.println("Constructor");
			
		}
		static
		{
			System.out.println("SIB 1");
		}
		static
		{
			System.out.println("SIB 2");
		}
		{
			System.out.println("IIB 1");		
	}	
		{
			System.out.println("IIB 2");		
	}	
		
	}

// 2 times IIB bcz 2 objects are created
// 2 times constructor bcz 2 objects are created
