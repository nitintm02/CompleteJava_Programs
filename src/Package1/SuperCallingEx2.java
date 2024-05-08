package Package1;
class College
{

	College()
	{
		System.out.println("College");
	}
}
	
class School extends College
{
	School ()
	{
		System.out.println("School");
	}
}


public class SuperCallingEx2 {

	public static void main(String[] args) {
		
		School s1=new School();
		

	}

}
