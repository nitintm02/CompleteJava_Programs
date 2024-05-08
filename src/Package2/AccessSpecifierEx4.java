// outside package without becoming subclass
package Package2;
import Package1.AccessSpecifierEx1;
public class AccessSpecifierEx4 
{

	public static void main(String[] args) 
	{
		AccessSpecifierEx1 e1= new AccessSpecifierEx1();
		e1.add();
		e1.sub(); // as expected
		e1.mul(); // as expected
		e1.div();// as expected
		

	}

}
