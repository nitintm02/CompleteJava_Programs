package Package1;
import java.util.Date;

public class FutureDate {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime()-(60*60*1000*24*2));
		//hrs*mins*sec*24hrs*days
		System.out.println(d2);
		
		
		

	}

}
