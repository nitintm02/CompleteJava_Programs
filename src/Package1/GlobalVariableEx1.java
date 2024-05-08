package Package1;

public class GlobalVariableEx1 {
	
	static int age=43; //global
	//static String name="Nitin";
	static String name;
	
	static void add ()
	{
		System.out.println(age);
		
	}

	public static void main(String[] args) {
		System.out.println(age);
		name="Nitin"; // initialize in main method is allowed if declared earlier
		System.out.println(name); 
		
		age=31; // updating the value
		System.out.println(age);
		
		

		
		

	}

}
