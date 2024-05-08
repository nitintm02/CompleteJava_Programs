package Package1;

public class GlobalNonstaticMix {
	
	String name="Sita";
	int age=19;
	double weight=90.87;
	void add (String name,int age, double weight)
	{
		System.out.println("My bio data is "+ name + age +  weight);
	}

	public static void main(String[] args) {
		
		GlobalNonstaticMix g1=new GlobalNonstaticMix ();
		System.out.println(g1.name);
		System.out.println(g1.age);
		g1.add("ram ", 51, 87.87);
	}

}
