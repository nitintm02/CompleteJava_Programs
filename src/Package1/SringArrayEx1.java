package Package1;

public class SringArrayEx1 {

	public static void main(String[] args) 
	{
		String names[]=new String[3];
		// declare and initialize  array
		names[0]="Nitin";
		names[1]="Test";
		names[2]="Engineer";
		//names[2]="MKT"; -- updates the value and shows updated value
		for (int i=0;i<=2;i++)
		{
			System.out.println(names[i]);
		}
		
		int rollno[]=new int[3];
		rollno[0]=77;
		rollno[1]=50;
		rollno[2]=500;
		
		for (int i=0;i<=2;i++)
		{
		
		System.out.println(rollno[i]);
		}
	}

}
