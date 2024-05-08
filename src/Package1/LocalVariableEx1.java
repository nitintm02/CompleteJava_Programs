package Package1;

public class LocalVariableEx1 {

	static void add() {
		
		int a=10; //local 
		int b=20; // local
		System.out.println(a+b);

	}

	void add (int a, int b)// local
	{
		
	}
	public static void main(String[] args) {
		
		int a=100;// local
		a=10;
		System.out.println();
		
	}
}
