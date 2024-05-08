package Package1;

public class ArraySDETEx1 {

	public static void main(String[] args) 
	{
		int a[]= {100,200,300,400};
		
		System.out.println("Length is " + a.length);
		
		for (int x:a)
		{
			System.out.println("Printing elements "+ x);
		}
		
		String s1="Welcome";
		String s2="Back";
		
		System.out.println(s1+" "+s2);
		System.out.println(s1.concat(s2));
	}

}
