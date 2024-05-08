package Package1;

class Parent
{
	static void add()
	{
		System.out.println("Addition");
	}
	
}
public class InheritanceEx1 extends Parent{
	
	static void sub()
	{
		System.out.println("Subtraction");
	}

	public static void main(String[] args)
	{
		sub();
		add();

	}

}
