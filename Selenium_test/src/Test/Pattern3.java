package Test;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter total lines of pattern ");
		
		int lines= s1.nextInt();
		
		for (int i=0;i<=lines;i=i+1)
		{
			for(int j=lines;j>i;j=j-1)
			{
				System.out.print(" ");
			}	
			for (int k=1;k<=i;k=k+1)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=0;i<=lines;i=i+1)
		{
			for(int j=lines;j>i;j=j-1)
			{
				System.out.print("  ");
			}	
			for (int k=1;k<=i;k=k+1)
			{
				System.out.print("  * ");
			}
			System.out.println();
		}
		

	}

}
