package Package1;

public class Vname 
{
	public static void main(String[] args) 
	{
		String input="fahim";
		
		for (int i=input.length()-1; i>=0;i--)
		{
			char a1 = input.charAt(i);
			System.out.println(a1);
		}
	}
	
	
//	public static void main(String[] args) 
//	{
//		String input="priya";
//	
//		for (int i=0; i<input.length();i++) 
//			// -1 is added to avoid out of bound exception, length method will give total count of char (5)
////			 * but i should look for 0 to 4 only (boundaries)
////			 * 
////			 * array/string will look for zero based index and string length is 5 hence -1 will be used
//		{
//		
//		char a1= input.charAt(i);
//		System.out.println(a1);
//	}
	}
//	}
