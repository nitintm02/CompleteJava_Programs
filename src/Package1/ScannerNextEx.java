package Package1;

import java.util.Scanner;

public class ScannerNextEx 
{

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		int number1= s1.nextInt();
		int number2= s1.nextInt();
		
		int sum= number1+number2;
		System.out.println("Sum of two numbers is " +sum);
		
		

	}

}
