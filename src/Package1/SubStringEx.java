package Package1;

public class SubStringEx {

	public static void main(String[] args) {
		String name1="Test Engineer";
		System.out.println(name1.substring(5));
		// space also includes in value. starts from 0 the value
		System.out.println(name1.substring(7));
		System.out.println(name1.subSequence(5,8));
		// 2nd value displays one less even if counted from 0

	}

}
