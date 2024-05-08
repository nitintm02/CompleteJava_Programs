package Package1;

public class BothMethodsAssgn 
{
	
	void add ()
	{
		int a=100;
		int b= 200;
		System.out.println(a+b);
	}
	
	static void sub()
	{
		int a=1000;
		int b= 200;
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		
		sub();
		BothMethodsAssgn a1=new BothMethodsAssgn();
		a1.add();
		

	}

}
