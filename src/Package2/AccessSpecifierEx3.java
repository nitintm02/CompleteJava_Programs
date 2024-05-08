package Package2;
import Package1.AccessSpecifierEx1;
//outside package by becoming subclass
public class AccessSpecifierEx3 extends AccessSpecifierEx1
{
	

	public static void main(String[] args) 
	{
		AccessSpecifierEx3 e1= new AccessSpecifierEx3();
		e1.add();
		e1.sub(); // not an error as expected
		e1.mul();
		e1.div();// not an error as expected
		
			
	}

}
