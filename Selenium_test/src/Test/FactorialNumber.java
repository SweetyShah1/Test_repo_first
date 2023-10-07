package Test;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args)
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter No1 ");
		int no1= s1.nextInt();
		int fact= 1;
		for (int i=1; i<=no1; i=i+1)
		{
			fact= fact*i;
		}
	
		System.out.println("Factorial is "+ fact);
		
	}

}
