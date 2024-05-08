package Package1;

public class AccessSpecifierEx1
{
	public void add()
	{
		System.out.println("1");
	}
	
	private void subtr()
	{
		System.out.println("2");
	}
	
	protected void mul()
	{
		System.out.println("3");
	}
	
	 void div()
	{
		 System.out.println("4");
	}
	public static void main(String[] args) 
	{
		AccessSpecifierEx1 e1=new AccessSpecifierEx1();
		e1.add();
		e1.subtr();
		e1.mul();
		e1.div();
	}

}
