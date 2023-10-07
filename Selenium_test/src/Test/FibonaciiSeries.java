package Test;

import java.util.Scanner;

public class FibonaciiSeries {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter No1 ");
		int no1= s1.nextInt();
		int l1,l2, p; // last1 , last 2 and print variable;
		l1=1;
		l2=1;
		p=1;
		System.out.print("0  1  ");
		for (int i=2; i<no1; i++)
		{
		
			System.out.print(" "+p+ " ");
			l1=l2;
			l2=p;
			p=p+l1;
			
		}
	}

}
