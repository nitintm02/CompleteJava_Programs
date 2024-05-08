package Package1;
class Parent1
{
	void add()
	{
		System.out.println("Add");
	}
	void sub()
	{
		System.out.println("sub");
	}
}
public class NonStaticInheritance extends Parent1 {
	void mul()
	{
		System.out.println("mul");
	}

	public static void main(String[] args) {
		
		NonStaticInheritance c1= new NonStaticInheritance ();
		c1.mul();
		c1.add();
		c1.sub();
		

	}

}
