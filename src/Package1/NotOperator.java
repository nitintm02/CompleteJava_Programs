package Package1;

public class NotOperator {

	public static void main(String[] args) {
		
		int a=20;
		int b=30;
		if(! (a==b || b!=a))
		{
			System.out.println("Or with Not operator");
		}
		if(! (a==b && b!=a))
		{
			System.out.println("AND with Not operator");
		}

	}

}
