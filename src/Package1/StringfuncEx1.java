package Package1;

public class StringfuncEx1 {

	public static void main(String[] args) {
		String name="Nitin";
		System.out.println(name.length());
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('i'));// repetetive letters will be explained later
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.concat(" is my name "));
		String first_name="T";
		String last_name="M";
		System.out.println(first_name.concat(last_name));
		System.out.println(first_name.concat(" ").concat(last_name));
		System.out.println(name.contains("nit"));//case sensitive
		String title_of_page="    Eat Food now";
		System.out.println(title_of_page.trim());// removes space from first and last not in middle
		
	}

}
