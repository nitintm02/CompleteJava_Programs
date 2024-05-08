package Package1;
import java.util.Date;

public class getCurrentdate {

	public static void main(String[] args)
	{
		Date d1=new Date();
		System.out.println(d1);
		// to string comes from date class
		String input= d1.toString();
		System.out.println(input);
		String month= input.substring (4, 7);
		System.out.println(month);
		String date= input.substring (8, 10);
		System.out.println(date);
		String year= input.substring(24);
		System.out.println(year);
		String year1= input.substring(input.length()-4); 
		// another way to get year same o/p as line 18
		System.out.println(year1);
		
		

		
	}

}
