package Package1;

public class ThisStatementEx1 
{
	ThisStatementEx1 (int a)
	{
		this ("nitin");
		//this(100);
		System.out.println("1");
	}
	
	ThisStatementEx1 (double b)
	{
		
		//this(9.8);
		System.out.println("2");
	}
	ThisStatementEx1 (char c)
	{
		this (7.7);
		//this ('a',"Nitin"); 
		System.out.println("3");
	}
	ThisStatementEx1 (String d)
	{
		this ('z');
		//this ();
		System.out.println("4");
	}
	public static void main(String[] args)
	{
	
	ThisStatementEx1 t1=new ThisStatementEx1 (2);		

	}

}

// why 2 and 4 is printed?
