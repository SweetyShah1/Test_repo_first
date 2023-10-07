package Test;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter total lines of pattern ");
		
		int line= s1.nextInt();
		
		for (int i=line;i>0;i=i-1)
		{
			for (int j=0;j<i;j=j+1)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		for (int i=0;i<=line;i=i+1)
		{
			for (int j=1;j<=i;j=j+1)
			{
				System.out.print(j);
			}
			System.out.println();
		}

		int p=1;
		for (int i=0;i<=line;i=i+1)
		{
			for (int j=1;j<=i;j=j+1)
			{
				System.out.print(" "+ p+ " ");
				p=p+1;
			}
			System.out.println();
		}
		
	}

}
