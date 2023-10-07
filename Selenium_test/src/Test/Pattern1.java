package Test;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args)
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter total lines of pattern ");
		int line= s1.nextInt();
		
		for (int i=0;i<line;i=i+1)
		{
			for (int j=0;j<=i;j=j+1)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
