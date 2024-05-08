package Package1;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquals {
	public static void main(String[] args) 
	{
		System.out.println("Starting of 1st Array");		
		Scanner s1 =new Scanner (System.in);
		int rollno[]=new int[3];		
		for (int i=0;i<3;i++)
		{
			System.out.println("Enter Array "+i);
			rollno[i]=s1.nextInt();
			System.out.println(rollno[i]);
		}		
		System.out.println("Starting of 2nd Array");		
		int rollno1[]=new int[3];
		for (int i=0;i<3;i++)
		{
			System.out.println("Enter Array "+i);
			rollno1[i]=s1.nextInt();
			System.out.println(rollno1[i]);
		}		
		if (Arrays.equals(rollno, rollno1)==true)
		{
			System.out.println("Equal Arrays");
		}
		else 
		{
			System.out.println("Unequal Arrays");
		}
	}

}
