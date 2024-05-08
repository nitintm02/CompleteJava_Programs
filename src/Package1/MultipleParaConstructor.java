package Package1;

public class MultipleParaConstructor
{
	MultipleParaConstructor()
	{
		System.out.println("One Constructor");
	}
	MultipleParaConstructor(int a)
	{
		System.out.println("Int Constructor");
	}
	MultipleParaConstructor(char X)
	{
		System.out.println("Character Constructor");
	}
	MultipleParaConstructor(byte a1, short a2, int a3, long a4, float a5, double a6, char a7, boolean a8, String a10)
	{
		System.out.println("Multiple Constructor");
	}

	public static void main(String[] args) 
	{
		MultipleParaConstructor c1= new MultipleParaConstructor();
		MultipleParaConstructor c2 = new MultipleParaConstructor('Z');
		MultipleParaConstructor c3= new MultipleParaConstructor ((byte)10, (short)20, 200, 35l, 6.7f, 77.5, 'N', false, "YES");
		

	}

}
