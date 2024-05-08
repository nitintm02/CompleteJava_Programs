package Package1;
public class NonStaticAllMethodsAssgn
{
	void add()
	{
		double a=10;
		double b=10.5;
		System.out.println(a+b);
	}	
	void sub()
	{
		int a=100;
		double b=10.5;
		System.out.println(a-b);
	}
	void product()
	{
		int a=4;
		int b=10;
		System.out.println(a*b);
	}
	void division()
	{
		double a=10;
		int b=20;
		System.out.println(a/b);
	}	
	void modulos()
	{
		double a=70;
		int b=20;
		System.out.println(a%b);
	}
	public static void main(String[] args) 
	{
		NonStaticAllMethodsAssgn n1= new NonStaticAllMethodsAssgn();
		n1.add();
		n1.sub();
		n1.product();
		n1.division();
		n1.modulos();
	}
}
