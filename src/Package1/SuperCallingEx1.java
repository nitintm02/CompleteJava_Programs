package Package1;
class Parent_Class1
{
	Parent_Class1(int a,int b)
	{
		
		System.out.println("Grand parent");

	}
}
class Child_Class extends Parent_Class1
{
	Child_Class(int a)
	{
	super(100,1000);
		System.out.println("parent");

	}
}
public class SuperCallingEx1 extends Child_Class
{
	SuperCallingEx1()
	{
		super(100);
		System.out.println("Child");
	}
	public static void main(String[] args) 
	{
		new SuperCallingEx1();
		
		
	}

}
