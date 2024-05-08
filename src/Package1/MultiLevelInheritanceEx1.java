package Package1;

class Grand_Parent
{
	static void add()
	{
		System.out.println("Add");
	}
}

class Parent_Class extends Grand_Parent
{
	static void sub()
	{
		System.out.println("sub");
	}
}

public class MultiLevelInheritanceEx1 extends Parent_Class

{
	
	static void mul()
	{
		System.out.println("mul");
	}

	public static void main(String[] args)
	{
		add();
		sub();
		mul();

	}

}
