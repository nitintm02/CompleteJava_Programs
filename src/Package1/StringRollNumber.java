package Package1;

public class StringRollNumber {

	public static void main(String[] args) {
		
		String names[]=new String[3];
		names [0]="Jyothi";
		names [1]="Nitin";
		names [2]="MKT";		
		
		int rollno[]=new int[3];
		rollno[0]=77;
		rollno[1]=50;
		rollno[2]=40;
		
		char gender[]= new char[3];
		gender [0]='F';
		gender [1]='M';
		gender [2]='M';
		
		System.out.println("Student name "  +  "  Roll Number "+ "       Gender");
		
		for (int i=0;i<3;i++)
		{
			System.out.println(names[i]+ "              " + rollno[i]+ "               "+ gender[i]);
		}
	}

}
