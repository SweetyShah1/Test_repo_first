package Test;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) 
	{
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter No1 ");
		int no1= s1.nextInt();
		
		System.out.println("No1 is "+ no1);
		int f=0;
		if (no1==0)
			System.out.println("Enter valid input");
		else if (no1==1)
			System.out.println("No1 is not prime number ");
		else if (no1==2)
			System.out.println("No1 is prime number");
		else
		{
			for (int i=2; i<no1; i++)
			{
				if(no1%i==0)
				{
					f=1;
					break;
				}
			}
			
			if (f==1)
				System.out.println(no1 + " is not prime number");
			else
				System.out.println(no1 + " is prime number");
		}
		
	}

}
